package com.company;

import java.util.ArrayList;

/**
 * Created by skaggsc2 on 2/8/16.
 */
class MainStreet extends Room{

    int roleNum = 4;
    int adjRoomNum = 3;
    String name = "MainStreet";
    Scene movie;
    Role R1 = new Role(1, "Railroad Worker", false);
    Role R2 = new Role(2, "Falls off Roof", false);
    Role R3 = new Role(3, "Woman in Black Dress", false);
    Role R4 = new Role(4, "Mayor McGlinty", false);
    int shots = 3;
    public MainStreet(){
        super();
        MainStreetRoleList.add(R1);
        MainStreetRoleList.add(R2);
        MainStreetRoleList.add(R3);
        MainStreetRoleList.add(R4);
    }

    public String getName(){return name;}
    public ArrayList<Room> getAdjRooms(){return MainStreetAdjList;}
    public ArrayList<Role> getRoomRoles(){return MainStreetRoleList;}
    public int getRoleNum(){return roleNum;}
    public int getAdjRoomNum(){return adjRoomNum;}
    public void addRoom(Room room){MainStreetAdjList.add(room);}
    public Scene getScene(){return movie;}
    public int getShots(){return shots;}
    public void setShots(int shots){this.shots =shots;}
    public void setScene(Scene scene){
        movie= scene;
    }
}