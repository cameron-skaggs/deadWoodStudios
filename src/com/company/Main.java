package com.company;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.*;
import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;
import java.util.*;


/***************************************************
 *
 * What needs to be done:
 * Program Working!
 *
 ****************************************************/
public class Main extends JPanel {

    public static int playerNum;

    /************************************************
    *
    *                   Main Method:
     *
     *                  (1) Initializes all of the rooms
     *
     *                  (2) Initializes all of the adjacent rooms
     *
     *                  (3) Creates a room adjacency list
     *
     *                 (4) These if statements ensure our player goes to the right methods depending on whether or not he is
     *                     acting.
    *
    * ***********************************************/


    public static void main(String[] args) {

        ArrayList<Player> playerArrayList= new ArrayList<Player>();
        ArrayList<Room> roomArrayList = new ArrayList<Room>();
        Label.createAndShowGUI();
/*
        try{
            BufferedImage myPicture = ImageIO.read(new File("/home/skaggsc2/Documents/CS345/hw2/Gameboards/gameBoard.jpg"));
            JLabel label1 = new JLabel(new ImageIcon(myPicture));


            JOptionPane.showMessageDialog(null, label1);

        }
        catch (IOException ex){
            System.out.println("Invalid Picture");
        }

*/

        /************************************
        *
        *       (1) Room Initialization
        *
        **************************************/

        Room trailer = new Trailer();
        Room saloon = new Saloon();
        Room mainStreet = new MainStreet();
        Room hotel = new Hotel();
        Room trainStation = new TrainStation ();
        Room jail = new Jail();
        Room generalStore = new GeneralStore();
        Room ranch = new Ranch();
        Room secretHideout = new SecretHideout();
        Room bank = new Bank();
        Room church = new Church();
        Room castingOffice = new CastingOffice();

        /************************************
         *
         *      (2) Adjacency List
         *
         **************************************/

        trailer.addRoom(saloon);
        trailer.addRoom(hotel);
        trailer.addRoom(mainStreet);
        trailer.addRoom(castingOffice);

        saloon.addRoom(trailer);
        saloon.addRoom(mainStreet);
        saloon.addRoom(generalStore);
        saloon.addRoom(bank);

        mainStreet.addRoom(saloon);
        mainStreet.addRoom(trailer);
        mainStreet.addRoom(jail);

        hotel.addRoom(trailer);
        hotel.addRoom(bank);
        hotel.addRoom(church);

        bank.addRoom(saloon);
        bank.addRoom(ranch);
        bank.addRoom(hotel);
        bank.addRoom(church);

        church.addRoom(bank);
        church.addRoom(hotel);
        church.addRoom(secretHideout);

        ranch.addRoom(bank);
        ranch.addRoom(secretHideout);
        ranch.addRoom(castingOffice);
        ranch.addRoom(generalStore);

        secretHideout.addRoom(church);
        secretHideout.addRoom(ranch);
        secretHideout.addRoom(castingOffice);

        castingOffice.addRoom(secretHideout);
        castingOffice.addRoom(ranch);
        castingOffice.addRoom(trainStation);

        trainStation.addRoom(castingOffice);
        trainStation.addRoom(generalStore);
        trainStation.addRoom(jail);

        generalStore.addRoom(ranch);
        generalStore.addRoom(saloon);
        generalStore.addRoom(trainStation);
        generalStore.addRoom(jail);

        jail.addRoom(mainStreet);
        jail.addRoom(generalStore);
        jail.addRoom(trainStation);

        /************************************
         *
         *       (3) Room Array Lists
         *
         **************************************/

        roomArrayList.add(saloon);
        roomArrayList.add(mainStreet);
        roomArrayList.add(hotel);
        roomArrayList.add(bank);
        roomArrayList.add(ranch);
        roomArrayList.add(church);
        roomArrayList.add(secretHideout);
        roomArrayList.add(trainStation);
        roomArrayList.add(generalStore);


        int playerNum = gameStart();
        makePlayers(trailer, playerArrayList);


        scene1 scene1 = new scene1();
        scene2 scene2 = new scene2();
        scene3 scene3 = new scene3();
        scene4 scene4 = new scene4();
        scene5 scene5 = new scene5();
        scene6 scene6 = new scene6();
        scene7 scene7 = new scene7();
        scene8 scene8 = new scene8();
        ArrayList<Scene> sceneArrayList = new ArrayList<Scene>();
        sceneArrayList.add(scene1);
        sceneArrayList.add(scene2);
        sceneArrayList.add(scene3);
        sceneArrayList.add(scene4);
        sceneArrayList.add(scene5);
        sceneArrayList.add(scene6);
        sceneArrayList.add(scene7);
        sceneArrayList.add(scene8);

        for(int i = 0; i < roomArrayList.size(); i++ ){
            int j = sceneArrayList.size();
            int k =  (int)(Math.random()*j);
            roomArrayList.get(i).setScene(sceneArrayList.get(k));
        }

        while(Day.getDayCount() <= Day.getDayNum()) {

            boolean saloonScene = saloon.getScene().isComplete();
            boolean hotelScene = hotel.getScene().isComplete();
            boolean mainStScene = hotel.getScene().isComplete();
            boolean bankScene = bank.getScene().isComplete();
            boolean ranchScene = ranch.getScene().isComplete();
            boolean churchScene = church.getScene().isComplete();
            boolean secretScene = secretHideout.getScene().isComplete();
            boolean trainScene = trainStation.getScene().isComplete();
            boolean generalScene = generalStore.getScene().isComplete();
            if(saloonScene && hotelScene && mainStScene && bankScene && ranchScene && churchScene && secretScene && trainScene && generalScene){
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

                    System.out.println(player.getPlayerName() + " currently is in rank "
                            + player.getRank() + " and has the role " + player.getCurrentRole().getName()
                            + " along with " + player.getMoney() + " dollars.\n\n");

                    playerActTurn(player, newRoom);
                }
                if(!player.isActing()){
                    System.out.println(player.getPlayerName() + " has rank "
                            + player.getRank() + " and has "
                            + player.getMoney() + " dollars.\n\n");
                    if (newRoom.getName() == "Trailer"){
                        LabelTrailer.createAndShowGUI();
                    }
                    else if (newRoom.getName() == "Main Street"){
                        LabelStreet.createAndShowGUI();
                    }
                    else if (newRoom.getName() == "Saloon"){
                        //output picture gameBoard3-0
                        LabelSaloon.createAndShowGUI();
                    }
                    else if (newRoom.getName() == "Bank"){
                        //output picture gameBoard4-0
                        LabelBank.createAndShowGUI();
                    }
                    else if (newRoom.getName() == "Church"){
                        //output picture gameBoard5-0
                        LabelChurch.createAndShowGUI();
                    }
                    else if (newRoom.getName() == "Hotel"){
                        //output picture gameBoard6-0
                        LabelHotel.createAndShowGUI();
                    }
                    else if (newRoom.getName() == "Ranch"){
                        //output picture gameBoard7-0
                        LabelRanch.createAndShowGUI();
                    }
                    else if (newRoom.getName() == "Secret Hideout"){
                        //output picture gameBoard8-0
                        LabelHideout.createAndShowGUI();
                    }
                    else if (newRoom.getName() == "Casting Office"){
                        //output picture gameBoard9-0
                        LabelOffice.createAndShowGUI();
                    }
                    else if (newRoom.getName() == "General Store"){
                        //output picture gameBoard10-0
                        LabelStore.createAndShowGUI();
                    }
                    else if (newRoom.getName() == "Train Station"){
                        //output picture gameBoard11-0
                        LabelStation.createAndShowGUI();
                    }
                    else if (newRoom.getName() == "Jail"){
                        //output picture gameBoard12-0
                        LabelJail.createAndShowGUI();
                    }
                    playerTurn(player, newRoom);
                }
            }
        }
        Day.determineWinner(playerArrayList, playerNum);

    }

    /************************************************
     *
     *              Game Start Method:
     *
     *              (1) Get user input for players
     *
     *              (2) Ensure amount of players is correct
     *
     *              (3) Make sure player put in right number
     *
     * ***********************************************/

    public static int gameStart() {

        /* (1) */
        Scanner userInput = new Scanner(System.in);
        System.out.println("\n Howdy partner! Welcome to DeadWood Studios! \n How many players? \n >");
        playerNum = userInput.nextInt();

        if(playerNum == 42){
            System.out.println(" So it goes... ");
            System.exit(42);
        }
        /* (2) */
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
    public static void playerTurn(Player player, Room room) {

        if (room.getName() == "Casting Office") {

  /* (1) */
            ArrayList<Room> adjList = room.getAdjRooms();
            int size = room.getAdjRoomNum();
            Scanner userInput = new Scanner(System.in);

            System.out.print(" " + player.getPlayerName() + " you're in the " +
                    room.getName() + " you have $" + player.getMoney() +
                    " and are rank " + player.getRank() + ", chose yer next move \n"
                    + " (1) Move  \n (2)Upgrade Rank \n (3) Do nothin' \n > ");

            int playerChoice = userInput.nextInt();

        /* (2) */
            while (playerChoice < 1 || playerChoice > 4) {
                System.out.println(playerChoice + " is not a valid option partner, try again \n (1) Move \n" +
                        " (2) Chose a role \n" +
                        " (3) Upgrade Rank \n" + "(4) Do nothin' \n >");
                playerChoice = userInput.nextInt();
            }
        /* (3) */
            if (playerChoice == 1) {
                move(player, room, adjList);
            }

            if (playerChoice == 2 && player.getMoney() >= 4) {
                UpgradeRank(player, player.getMoney());
            } else {
                System.out.println(" You need more money friend.");
            }
        } else {

        /* (1) */
            ArrayList<Room> adjList = room.getAdjRooms();
            int size = room.getAdjRoomNum();
            Scanner userInput = new Scanner(System.in);
            if (room.getRoomRoles().size() == 0) {

                System.out.println(player.getPlayerName()
                        + " you're in the " + room.getName() + " choose your next move " +
                        "\n (1) Move \n" +
                        " (2) Do nothin' \n >");

                int playerChoice = userInput.nextInt();

                while (playerChoice < 1 || playerChoice > 2) {
                    System.out.println(playerChoice + " is not a valid option partner, try" +
                            " again \n (1) Move \n" +
                            " (2) Do nothin' \n >");
                    playerChoice = userInput.nextInt();
                }

                if (playerChoice == 1) {
                    move(player, room, adjList);
                }
            }
            if (room.getRoomRoles().size() > 0) {
                System.out.print(" " + player.getPlayerName() + " you're in the " +
                        room.getName() + " you have $" + player.getMoney() +
                        " and are rank " + player.getRank() + ", chose yer next move \n"
                        + " (1) Move \n (2) Chose a role \n (3) Do nothin' \n > ");

                int playerChoice = userInput.nextInt();

             /* (2) */

                while (playerChoice < 1 || playerChoice > 3) {
                    System.out.println(playerChoice + " is not a valid option partner, try again \n (1) Move \n" +
                            " (2) Chose a role \n" +
                            " (3) Do nothin' \n >");
                    playerChoice = userInput.nextInt();
                }
            /* (3) */
                if (playerChoice == 1) {
                    move(player, room, adjList);
                }

                if (playerChoice == 2) {
                    chooseRole(room, player, size, adjList);
                }
            }

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

        while (playerMove+1 >= size +1){
            System.out.println(" Bad move buddy");
            for (int i= 0; i < size; i++){
                int j = i+1;
                System.out.println("(" + j +") " + adjList.get(i).getName());
            }
            playerMove = userInput.nextInt() -1;
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
     *                   (1) The room has no roles (doesn't resolve)
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
        ArrayList<Role> roleList = new ArrayList<Role>();

        int roleSize = room.getScene().getRoleArrayList().size();
        int roomRoleSize = room.getScene().getRoleArrayList().size();

        for (int i=0; i < roomRoleSize; i++){
            int j = i+1;
            Role role = room.getRoomRoles().get(i);
            roleList.add(role);
            System.out.println("(" + j +") " + role.getName() + "- Rank:" +
                    role.getRoleRank() + "  Your rank: " + player.getRank());
        }
        for (int i=0; i < roleSize; i++){
            int j = i+roomRoleSize+1;
            //System.out.println(size2);
            Role role = room.getScene().getRoleArrayList().get(i);
            roleList.add(role);
            System.out.println("(" + j +") " + role.getName() + "- Rank:" +
                    role.getRoleRank() + "  Your rank: " + player.getRank());
        }
        int playerMove = userInput.nextInt()-1;
        Role role = roleList.get(playerMove);

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
                " you're acting as the " + role.getName() + " in the scene " + scene.getName() +
                " with "  + shots + " shot(s) left. You have +"
                + player.getRehearsalCount() + " rehearsals bonus." + " You must roll a "
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
            System.out.println(" You rolled a " + roll + "\n With you're bonus you get a " +
                    total );
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
    public static void UpgradeRank(Player player, int money){

        int temp = 1;
        if(money >= 4){
            temp = 2;
        }
        if(money >= 10){
            temp = 3;
        }
        if(money >= 18){
            temp = 4;
        }
        if(money >= 28){
            temp = 5;
        }
        if(money >= 40){
            temp = 6;
        }

        System.out.println( "Press the key correspondind to the rank you want \n"
                +"   RANK     Money \n"
                +"(1) 2         4   \n"
                +"(2) 3        10   \n"
                +"(3) 4        18   \n"
                +"(4) 5        28   \n"
                +"(5) 6        40   \n"
                +"you currently have " + money);

        Scanner userInput = new Scanner(System.in);
        int playerChoice = userInput.nextInt();

             /* (2) */

        while(playerChoice < 1 || playerChoice > 5){
            System.out.println(playerChoice + " is not a valid option partner, try again \n"
                    +"   RANK     Money \n"
                    +"(1) 2         4   \n"
                    +"(2) 3        10   \n"
                    +"(3) 4        18   \n"
                    +"(4) 5        28   \n"
                    +"(5) 6        40   \n"
                    +"you currently have $" + money + ">");

            playerChoice = userInput.nextInt();
        }

        if(playerChoice== 1 && temp >=2) {
            player.setRank(2);
            player.removeMoney(4);

        }
        if(playerChoice== 2 && temp >=2) {
            player.setRank(3);
            player.removeMoney(10);
        }

        if(playerChoice== 3 && temp >=2) {
            player.setRank(4);
            player.removeMoney(18);
        }

        if(playerChoice== 4 && temp >=2) {
            player.setRank(5);
            player.removeMoney(28);
        }

        if(playerChoice== 5 && temp >=2) {
            player.setRank(6) ;
            player.removeMoney(40);
        }
        else {
            System.out.println(" you do not have enough credits partner! be serious");

        }
        System.out.println(" Rank is now " + player.getRank());
        System.out.println(" You have $" + player.getMoney() + " left \n");


    }
}