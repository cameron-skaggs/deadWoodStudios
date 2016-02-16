package com.company;
import java.util.*;
public class Main {

    public static int playerNum;
    public static void main(String[] args) {
        Room saloon = new Saloon();
        Room trailer = new Trailer();
        ArrayList<Player> playerArrayList= new ArrayList<Player>();


      //  Room makeSaloon = Room.arrangeRooms(saloon);
/*
        for (int i = 0; i <  Room.trailerAdjList.size(); i++){
            System.out.println(Room.trailerAdjList.get(i));
        }
*/
        int playerNum = gameStart();
        makePlayers(trailer, playerArrayList);
        for(int i =0; i < playerNum; i++){
            Room newRoom = playerArrayList.get(i).getCurrentRoom();

            playerTurn(playerArrayList.get(i), newRoom, i+1);
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
        System.out.println(playerNum + " players, is this correct \n (1)Yes (2)No?");

        int correctPlayers = userInput.nextInt();

        if (correctPlayers==1) {
            System.out.println("Yahoo! Let's begin, partner!");
            if (playerNum <= 2){
                Day.setDayNum(3);
            }else{
                Day.setDayNum(4);
            }
            System.out.println(playerNum);



        } else gameStart();

        return playerNum;
    }

    public static void makePlayers(Room trailer, ArrayList<Player> playerArrayList){
        switch (playerNum){
            case 8:     Player player8 = new Player(trailer, 0);
                        playerArrayList.add(player8);
            case 7:     Player player7 = new Player(trailer, 0);
                        playerArrayList.add(player7);
            case 6:     Player player6 = new Player(trailer, 0);
                        playerArrayList.add(player6);
            case 5:     Player player5 = new Player(trailer, 0);
                        playerArrayList.add(player5);
            case 4:     Player player4 = new Player(trailer, 0);
                        playerArrayList.add(player4);
            case 3:     Player player3 = new Player(trailer, 0);
                        playerArrayList.add(player3);
            case 2:     Player player1 = new Player(trailer, 0);
                        playerArrayList.add(player1);
                        Player player2 = new Player(trailer, 0);
                        playerArrayList.add(player1);
        }
        Collections.reverse(playerArrayList);

    }

    public static void playerTurn(Player player, Room room, int nowPlaying){

        ArrayList<Room> adjList = room.getAdjRooms();
        int size = room.getAdjRoomNum();
        Scanner userInput = new Scanner(System.in);
        System.out.println("Player " + nowPlaying + " you're in the " + room.getName() +", chose yer next move \n"
        + " (1) Move \n (2) Chose a role \n (3) Do nothin' ");

        int playerChoice = userInput.nextInt();

        if(playerChoice== 1){
            System.out.println("\n Chose a room : \n");

            for (int i= 0; i< size; i++){
                int j = i+1;
                System.out.println("(" + j +") " + adjList.get(i).getName());
            }

            int playerMove = userInput.nextInt() - 1;
            System.out.println("You move into the " + adjList.get(playerMove).getName() + "\n");

            Room newRoom = adjList.get(playerMove);
            player.setRoom(newRoom);
            System.out.println(player.currentRoom.getName());
        }
    }
    public static Room findRoom(String room){
        if (room.equals("Trailer")){
            return new Trailer();
        }
        if(room.equals("Saloon")){
            return new Saloon();
        }
        if(room.equals("Hotel")){
            return new Hotel();
        }
        return null;
    }

}