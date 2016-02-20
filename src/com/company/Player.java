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
    boolean acting;
    int rehearsalCount;;

    public Player(Room newRoom,int money, int rank, boolean acting){
       currentRoom = newRoom;
        this.money = money;
        this.rank = rank;
        this.acting = acting;
    }

    public void addMoney(int money){
        this.money = this.money+money;
    }

    public int getMoney(){return money;}
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
    public boolean isActing(){return acting;}

    public void setActing(boolean acting){
        this.acting = acting;
    }
    public int getRehearsalCount(){return rehearsalCount;}
    public void setRehearsalCount(int rehearsalCount){
        this.rehearsalCount = rehearsalCount;
    }
}
