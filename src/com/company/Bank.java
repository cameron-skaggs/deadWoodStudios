package com.company;

import java.util.ArrayList;

/**
 * Created by skaggsc2 on 2/8/16.
 */
class Bank extends Room{

    int roleNum = 2;
    int adjRoomNum = 4;
    String name = "Bank";
    Scene movie;
    Role R1 = new Role(2, "Suspicious Gentleman", false);
    Role R2 = new Role(3, "Flustered Teller", false);

    int shots = 1;
    public Bank(){
        super();
        BankRoleList.add(R1);
        BankRoleList.add(R2);

    }

    public String getName(){return name;}
    public ArrayList<Room> getAdjRooms(){return BankAdjList;}
    public ArrayList<Role> getRoomRoles(){return BankRoleList;}
    public int getRoleNum(){return roleNum;}
    public int getAdjRoomNum(){return adjRoomNum;}

    public void addRoom(Room room){
        BankAdjList.add(room);
    }

    public Scene getScene(){return movie;}
    public int getShots(){return shots;}
    public void setShots(int shots){
        this.shots =shots;
    }
    public void setScene(Scene scene){
        movie = scene;
    }
}