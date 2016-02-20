package com.company;

import java.util.ArrayList;

/**
 * Created by skaggsc2 on 2/8/16.
 */
class Hotel extends Room{

    int roleNum = 4;
    int adjRoomNum = 3;
    String name = "Hotel";
    public Hotel(){
        super();
    }

    public String getName(){return name;}
    public ArrayList<Room> getAdjRooms(){return hotelAdjList;}
    public ArrayList<Role> getRoomRoles(){return hotelRoleList;}
    public int getRoleNum(){return roleNum;}
    public int getAdjRoomNum(){return adjRoomNum;}
    public void addRoom(Room room){hotelAdjList.add(room);}
}