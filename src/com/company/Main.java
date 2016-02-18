package com.company;
import java.util.*;


/*

(1) Initializes all of the rooms and players

(2) gameStart gets the number of players from the player, and sets the number of days the game will have.

(3)

 */
public class Main {

    public static int playerNum;

    public static void main(String[] args) {

        Room trailer = new Trailer();
        Room saloon = new Saloon();
        ArrayList<Player> playerArrayList= new ArrayList<Player>();

        int playerNum = gameStart();
        makePlayers(trailer, playerArrayList);

        System.out.println(Day.getDayCount());
        while(Day.getDayCount() == 1) {
            for (int i = 0; i < playerNum; i++) {

                Room newRoom = playerArrayList.get(i).getCurrentRoom();
                playerTurn(playerArrayList.get(i), newRoom);
            }
        }

    }
    public static int gameStart() {

        Scanner userInput = new Scanner(System.in);
        System.out.println("Howdy partner! Welcome to DeadWood Studios! \n How many players? ");
        playerNum = userInput.nextInt();

        while(playerNum > 8 || playerNum < 2){

            System.out.println("Sorry partner, only 2-8 players please. \n ");
            System.out.println("Howdy partner! Welcome to DeadWood Studios! \n How many players? ");
            playerNum = userInput.nextInt();
        }
        System.out.println(playerNum + " players, is this correct \n (1)Yes \n (2)No?");

        int correctPlayers = userInput.nextInt();

        if (correctPlayers==1) {
            System.out.println("Yahoo! Let's begin, partner!");
            if (playerNum <= 2){
                Day.setDayNum(3);
            }else{
                Day.setDayNum(4);
            }

        } else gameStart();

        return playerNum;
    }

    public static void makePlayers(Room trailer, ArrayList<Player> playerArrayList){

        switch (playerNum){
            case 8:     Player player8 = new Player(trailer, 0,1);
                        playerArrayList.add(player8);
                        player8.setPlayerName("Player 8");

            case 7:     Player player7 = new Player(trailer, 0,1);
                        playerArrayList.add(player7);
                        player7.setPlayerName("Player 7");

            case 6:     Player player6 = new Player(trailer, 0,1);
                        playerArrayList.add(player6);
                        player6.setPlayerName("Player 6");

            case 5:     Player player5 = new Player(trailer, 0,1);
                        playerArrayList.add(player5);
                        player5.setPlayerName("Player 5");

            case 4:     Player player4 = new Player(trailer, 0,1);
                        playerArrayList.add(player4);
                        player4.setPlayerName("Player 4");

            case 3:     Player player3 = new Player(trailer, 0,1);
                        playerArrayList.add(player3);
                        player3.setPlayerName("Player 3");

            case 2:     Player player2 = new Player(trailer, 0,1);
                        playerArrayList.add(player2);
                        player2.setPlayerName("Player 2");

                        Player player1 = new Player(trailer, 0,1);
                        playerArrayList.add(player1);
                        player1.setPlayerName("Player 1");
        }
        Collections.reverse(playerArrayList);

    }

    public static void playerTurn(Player player, Room room){

        ArrayList<Room> adjList = room.getAdjRooms();
        int size = room.getAdjRoomNum();
        Scanner userInput = new Scanner(System.in);
        System.out.println(player.getPlayerName() + " you're in the " + room.getName() +", chose yer next move \n"
        + " (1) Move \n (2) Chose a role \n (3) Do nothin' ");

        int playerChoice = userInput.nextInt();

        if(playerChoice== 1) {
            move(player, room, size, adjList);
        }

        if(playerChoice == 2){
            chooseRole(room, player, size, adjList);
        }
    }

    public static void move(Player player, Room room, int size, ArrayList<Room> adjList){
        System.out.println("\n Chose a room : \n");

        for (int i= 0; i< size; i++){
            int j = i+1;
            System.out.println("(" + j +") " + adjList.get(i).getName());
        }
        Scanner userInput = new Scanner(System.in);
        int playerMove = userInput.nextInt() - 1;
        System.out.println("You move into the " + adjList.get(playerMove).getName() + "\n");

        Room newRoom = adjList.get(playerMove);
        player.setRoom(newRoom);
    }

    public static void chooseRole(Room room, Player player,int size, ArrayList<Room> adjList) {

        Scanner userInput = new Scanner(System.in);
        System.out.println("\n Roles in " + room.getName() + "\n");
        int roleSize = room.getRoleNum();

        if (room.getRoomRoles().size()==0) {
            System.out.println("No roles left in this room partner. Try again! \n");
            System.out.println(player.getPlayerName() + " you're in the " + room.getName() + ", chose yer next move \n"
                    + " (1) Move \n (2) Do nothin' ");
            int playerChoice2 = userInput.nextInt();
            if (playerChoice2 == 1) {
                move(player, room, size, adjList);
            }
        }
        for (int i=0; i < roleSize; i++){
            //System.out.println(room.getRoomRoles().size());
            int j = i+1;
            Role role = room.getRoomRoles().get(i);
            System.out.println("(" + j +") " + role.getName() + "- Rank:" +
                    role.getRoleRank() + "  Your rank: " + player.getRank());
        }
        int playerMove = userInput.nextInt() - 1;
        Role role = room.getRoomRoles().get(playerMove);

        if(player.getRank() < role.getRoleRank()){
            System.out.println("Sorry partner, your rank is "
                    + player.getRank() + " you need to be rank " +
                    role.getRoleRank() + "or above");
        }
        if(role.isInUSe()){
            System.out.println("There is already an actor in this here role!");
        }
        else{
            player.setCurrentRole(role);
            role.setInUSe(true);
            System.out.println( "You're now the " + role.getName() + "\n");

        }

    }
}