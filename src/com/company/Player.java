package com.company;

/**
 * Created by skaggsc2 on 2/8/16.
 */
public class Player {
    Room currentRoom = new Trailer();
    private int rank;
    int money;
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

    public Room getCurrentRoom(){

        return currentRoom;
    }

}
