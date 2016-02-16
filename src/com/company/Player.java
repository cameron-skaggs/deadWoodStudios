package com.company;

/**
 * Created by skaggsc2 on 2/8/16.
 */
public class Player {
    Room currentRoom = new Trailer();
    private int rank;
    int money;
    String playerName;
    //boolean acting;
    //int reCount;
    //Role tempRole;
    //int credits;

    public Player(Room newRoom,int money){
       currentRoom = newRoom;
        this.money = money;
    }
    public void setRoom(Room newRoom){

        currentRoom = newRoom;

    }

    public void setPlayerName(String playerName){
        this.playerName = playerName;
    }

    public String getPlayerName(){
        return playerName;
    }

    public Room getCurrentRoom(){

        return currentRoom;
    }

}
