package com.company;

/**
 * Created by skaggsc2 on 2/8/16.
 */
public class Player {
    Room currentRoom = new Trailer();
    private int rank;
    int money;
    String playerName;
    Role currentRole;
    //boolean acting;
    //int reCount;
    //Role tempRole;
    //int credits;

    public Player(Room newRoom,int money, int rank){
       currentRoom = newRoom;
        this.money = money;
        this.rank = rank;
    }

    public void setRoom(Room newRoom){currentRoom = newRoom;}

    public void setPlayerName(String playerName){
        this.playerName = playerName;
    }

    public String getPlayerName(){return playerName;}

    public Room getCurrentRoom(){return currentRoom;}

    public int getRank(){return rank;}

    public void setCurrentRole(Role currentRole){
        this.currentRole = currentRole;
    }
    public Role getCurrentRole(){return currentRole;}
}
