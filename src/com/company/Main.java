package com.company;
import java.util.*;


/*
 *
 * (1) Initializes all of the rooms and players
 *
 * (2) gameStart gets the number of players from the player, and sets the number of days the game will have.
 *
 * (3) The majority of the game occures in this while loop. Once all the scenes have been completed
 *     the day class iterates. Once the days are completed the program will terminate
 *
 * (4) These if statements ensure our player goes to the right methods depending on whether or not he is
 *     acting.
 *
 *
 */
public class Main {

    public static int playerNum;

    /************************************************
    *
    *                   Main Method
    *
    * ***********************************************/

    public static void main(String[] args) {

        /* (1) */
        ArrayList<Player> playerArrayList= new ArrayList<Player>();

        Room trailer = new Trailer();
        Room saloon = new Saloon();
        Room mainStreet = new MainStreet();
        Room hotel = new Hotel();

        trailer.addRoom(saloon);
        trailer.addRoom(hotel);
        trailer.addRoom(mainStreet);

        saloon.addRoom(trailer);
        saloon.addRoom(mainStreet);

        mainStreet.addRoom(saloon);
        mainStreet.addRoom(trailer);
        mainStreet.addRoom(hotel);

        hotel.addRoom(trailer);

        /* (2) */
        int playerNum = gameStart();
        makePlayers(trailer, playerArrayList);

        /* (3) */
        while(Day.getDayCount() <= Day.getDayNum()) {

            boolean saloonScene = saloon.getScene().isComplete();
            boolean hotelScene = hotel.getScene().isComplete();
            boolean mainStScene = hotel.getScene().isComplete();
            if(saloonScene && hotelScene && mainStScene){
                int count = Day.getDayCount() +1;
                Day.setDayNum(count);
                System.out.println(" Day has ended now on day " +
                        Day.getDayCount() + "Every actor back to their trailers!" );
                for (int i = 0; i < playerNum; i++){
                    playerArrayList.get(i).setRoom(trailer);
                }
            }
            for (int i = 0; i < playerNum; i++) {

                Player player = playerArrayList.get(i);
                Room newRoom = playerArrayList.get(i).getCurrentRoom();
                if(player.isActing()){
                    playerActTurn(player, newRoom);
                }
                if(!player.isActing()){
                    playerTurn(player, newRoom);
                }
            }
        }

    }
    /************************************************
     *
     *              Game Start Method
     *
     * ***********************************************/
    public static int gameStart() {

        Scanner userInput = new Scanner(System.in);
        System.out.println("\n Howdy partner! Welcome to DeadWood Studios! \n How many players? \n >");
        playerNum = userInput.nextInt();

        while(playerNum > 8 || playerNum < 2){

            System.out.println("\n Sorry partner, only 2-8 players please. \n ");
            System.out.println("\n Howdy partner! Welcome to DeadWood Studios! \n How many players? \n >");
            playerNum = userInput.nextInt();
        }
        System.out.println(" "+ playerNum + " players, is this correct? \n (1)Yes \n (2)No? \n >");

        int correctPlayers = userInput.nextInt();

        if (correctPlayers==1) {
            System.out.println("\n Yahoo! Let's begin, partner! \n");
            if (playerNum <= 2){
                Day.setDayNum(3);
            }else{
                Day.setDayNum(4);
            }

        } else gameStart();

        return playerNum;
    }
    /************************************************
     *
     *              Make Players Method :
     *
     *              (1) We use a switch statement so at least
     *                  players one and two are initialized.
     *
     *              (2) Because of the initialization of the players
     *                  we must reverse the Array List.
     *
     * ***********************************************/
    public static void makePlayers(Room trailer, ArrayList<Player> playerArrayList){

        /* (1) */
        switch (playerNum){
            case 8:     Player player8 = new Player(trailer, 0,1, false);
                        playerArrayList.add(player8);
                        player8.setPlayerName("Player 8");

            case 7:     Player player7 = new Player(trailer, 0,1, false);
                        playerArrayList.add(player7);
                        player7.setPlayerName("Player 7");

            case 6:     Player player6 = new Player(trailer, 0,1, false);
                        playerArrayList.add(player6);
                        player6.setPlayerName("Player 6");

            case 5:     Player player5 = new Player(trailer, 0,1,false);
                        playerArrayList.add(player5);
                        player5.setPlayerName("Player 5");

            case 4:     Player player4 = new Player(trailer, 0,1, false);
                        playerArrayList.add(player4);
                        player4.setPlayerName("Player 4");

            case 3:     Player player3 = new Player(trailer, 0,1, false);
                        playerArrayList.add(player3);
                        player3.setPlayerName("Player 3");

            case 2:     Player player2 = new Player(trailer, 0,1, false);
                        playerArrayList.add(player2);
                        player2.setPlayerName("Player 2");

                        Player player1 = new Player(trailer, 0,1, false);
                        playerArrayList.add(player1);
                        player1.setPlayerName("Player 1");
        }
        /* (2) */
        Collections.reverse(playerArrayList);

    }
    /************************************************
     *
     *              Player Turn Method:
     *
     *              (1) Initialize Important Variables,
     *
     *              (2) Ensures correct user input.
     *
     *              (3) Takes the player to the correct helper
     *                  function based on their choice.
     *
     * ***********************************************/
    public static void playerTurn(Player player, Room room){

        /* (1) */
        ArrayList<Room> adjList = room.getAdjRooms();
        int size = room.getAdjRoomNum();
        Scanner userInput = new Scanner(System.in);

        System.out.print(" " + player.getPlayerName() + " you're in the " +
                room.getName() +" you have $"+ player.getMoney() +
                " and are rank "+ player.getRank() + ", chose yer next move \n"
                + " (1) Move \n (2) Chose a role \n (3) Do nothin' \n > ");

        int playerChoice = userInput.nextInt();

        /* (2) */
        while(playerChoice < 1 || playerChoice > 3){
            System.out.println(playerChoice + " is not a valid option partner, try again \n (1) Move \n" +
                    " (2) Chose a role \n" +
                    " (3) Do nothin' \n >");
            playerChoice = userInput.nextInt();
        }
        /* (3) */
        if(playerChoice== 1) {
            move(player, room, adjList);
        }

        if(playerChoice == 2){
            chooseRole(room, player, size, adjList);
        }
    }
    /************************************************
     *
     *                   Move Method
     *
     * ***********************************************/
    public static void move(Player player, Room room,ArrayList<Room> adjList){
        System.out.println("\n Chose a room : \n");
        int size = adjList.size();
        for (int i= 0; i < size; i++){
            int j = i+1;
            System.out.println("(" + j +") " + adjList.get(i).getName());
        }
        System.out.println("\n >");
        Scanner userInput = new Scanner(System.in);
        int playerMove = userInput.nextInt() - 1;

        while (playerMove > size){
            System.out.println(" Bad move buddy");
            for (int i= 0; i < size; i++){
                int j = i+1;
                System.out.println("(" + j +") " + adjList.get(i).getName());
                playerMove = userInput.nextInt() -1;
            }
        }
        System.out.println(" You move into the " + adjList.get(playerMove).getName() + "\n");
        Room newRoom = adjList.get(playerMove);

        if(newRoom.getScene() != null){
            Scene scene =newRoom.getScene();
            if(!scene.isComplete()){
                System.out.println(" This room has the scene " +
                        scene.getName() + " it has the a budget of "
                        + scene.getBudget() + " million \n");
            }
            if(scene.isComplete()){
                System.out.println(" This room has no more scenes available ");
            }

        }

        player.setRoom(newRoom);
    }
    /************************************************
     *
     *                   Choose Role Method:
     *
     *                   (1) The room has no roles
     *
     *                   (2) Prints roles
     *
     *                   (3) Rank doesn't reach role
     *
     *                   (4) Roles are already taken
     *
     *                   (5) Successful Role Change
     *
     * ***********************************************/
    public static void chooseRole(Room room, Player player,int size, ArrayList<Room> adjList) {

        Scanner userInput = new Scanner(System.in);
        System.out.println("\n Roles in " + room.getName() + "\n");
        int roleSize = room.getRoleNum();

        /* (1) */
        if (room.getRoomRoles().size()==0) {
            System.out.println("No roles left in this room partner. Try again! \n");
            System.out.println(player.getPlayerName() + " you're in the " + room.getName() + ", chose yer next move \n"
                    + " (1) Move \n (2) Do nothin' ");
            int playerChoice2 = userInput.nextInt();
            /*
            * Error: Doesn't resolve.
            * */
            if (playerChoice2 == 1) {
                move(player, room, adjList);
            }
        }
        /* (2) */
        for (int i=0; i < roleSize; i++){
            int j = i+1;
            Role role = room.getRoomRoles().get(i);
            System.out.println("(" + j +") " + role.getName() + "- Rank:" +
                    role.getRoleRank() + "  Your rank: " + player.getRank());
        }
        int playerMove = userInput.nextInt() - 1;
        Role role = room.getRoomRoles().get(playerMove);

        if(player.getRank() < role.getRoleRank()){
            System.out.println(" Sorry partner, your rank is "
                    + player.getRank() + " you need to be rank " +
                    role.getRoleRank() + " or above");
        }
        /* (4) */
        if(role.isInUSe()){
            System.out.println(" There is already an actor in this here role!");
        }
        if(player.getRank() >= role.getRoleRank() && !role.isInUSe()){
            player.setCurrentRole(role);
            role.setInUSe(true);
            player.setActing(true);
            System.out.println( " You're now the " + role.getName() + "\n");

        }

    }
    /************************************************
     *
     *                   Acting Turn Method
     *
     * ***********************************************/
    public static void playerActTurn(Player player, Room room){

        Scene scene = room.getScene();
        int budget = scene.getBudget();
        int shots = room.getShots();
        Scanner userInput = new Scanner(System.in);
        Role role = player.getCurrentRole();
        System.out.println("  " + player.getPlayerName() +
                " you're acting as the " + role.getName() + " in the scene " + scene.getName() + " you have +"
                + player.getRehearsalCount() + " rehearsals bonus" + " You must roll a "
                + budget + " or higher\n (1) Rehearse \n (2) Roll");

        int playerChoice = userInput.nextInt();

        while (playerChoice > 2 || playerChoice < 1){
            System.out.println("Wrong move bucko \n");
            System.out.println(player.getPlayerName() +
                    " you're acting as the " + role.getName() + " you have +"
                    + player.getRehearsalCount() + " rehearsals bonus you need to roll" +
                   budget + " or higher\n (1) Rehearse \n (2) Roll");

            playerChoice = userInput.nextInt();
        }
        if(playerChoice == 1){
            player.setRehearsalCount(player.getRehearsalCount()+1);
            System.out.println(" You're rehearsal count is now " + player.getRehearsalCount());
        }
        if(playerChoice == 2){

            int roll = (int)(Math.random()*6) + 1;
            int total = roll+ player.getRehearsalCount();
            System.out.println(" You rolled a " + roll + "\n With you're bonus you get a " + total);
            if (total >= budget){
                System.out.println(" You completed the shot! ");
                if(shots > 0){
                    System.out.println("You have " + shots + " shot(s) left");
                    room.setShots(shots-1);
                }
                if(shots == 0){
                    System.out.println("Scene Complete!");
                    scene.setComplete(true);
                    player.setActing(false);

                    if(role.isOnCard()){
                        player.addMoney(budget);
                        System.out.println("You made $" + budget + "!");
                    }
                }
                /*
                * I prefer this method of adding money
                * */
                if(role.isOnCard()){
                    player.addMoney(3);
                    System.out.println("You made $3!");
                }
                if(!role.isOnCard()){
                    player.addMoney(2);
                    System.out.println("You made $2!");
                }
            }
        }
    }
}