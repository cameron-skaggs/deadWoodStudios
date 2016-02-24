package com.company;

import java.util.ArrayList;

/**
 * Created by skaggsc2 on 2/8/16.
 */
class Hotel extends Room{

    int roleNum = 4;
    int adjRoomNum = 3;
    String name = "Hotel";
    Scene movie;
    Role R1 = new Role(1, "Sleeping Drunkard", false);
    Role R2 = new Role(1, "Farco Player", false);
    Role R3 = new Role(2, "Falls from Balcony", false);
    Role R4 = new Role(3, "Austrailian Bartender", false);

    int shots = 3;
    public Hotel(){
        super();
        hotelRoleList.add(R1);
        hotelRoleList.add(R2);
        hotelRoleList.add(R3);
        hotelRoleList.add(R4);

    }


    public String getName(){return name;}
    public ArrayList<Room> getAdjRooms(){return hotelAdjList;}
    public ArrayList<Role> getRoomRoles(){return hotelRoleList;}
    public int getRoleNum(){return roleNum;}
    public int getAdjRoomNum(){return adjRoomNum;}
    public void addRoom(Room room){hotelAdjList.add(room);}
    public int getShots(){return shots;}
    public void setShots(int shots){this.shots =shots;}
    public void setScene(Scene scene){
        movie = scene;
    }
    public Scene getScene(){return movie;}
}