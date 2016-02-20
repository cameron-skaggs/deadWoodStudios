package com.company;

import java.util.ArrayList;

/**
 * Created by skaggsc2 on 2/8/16.
 */
class Hotel extends Room{

    int roleNum = 4;
    int adjRoomNum = 3;
    String name = "Hotel";
    Film movie = new Film();
    Role SD = new Role(1, "Sleeping Drunkard", false);
    Role FP = new Role(1, "Faro Player", false);
    int shots = 3;
    public Hotel(){
        super();
        hotelRoleList.add(SD);
        hotelRoleList.add(FP);
    }

    public String getName(){return name;}
    public ArrayList<Room> getAdjRooms(){return hotelAdjList;}
    public ArrayList<Role> getRoomRoles(){return hotelRoleList;}
    public int getRoleNum(){return roleNum;}
    public int getAdjRoomNum(){return adjRoomNum;}
    public void addRoom(Room room){hotelAdjList.add(room);}
    public Scene getScene(){return movie;}
    public int getShots(){return shots;}
    public void setShots(int shots){this.shots =shots;}
}