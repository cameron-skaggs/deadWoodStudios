package com.company;

import java.util.ArrayList;

/**
 * Created by skaggsc2 on 2/8/16.
 */
class Ranch extends Room{

    int roleNum = 3;
    int adjRoomNum = 4;
    String name = "Ranch";
    Scene movie;
    Role R1 = new Role(1, "Shot in the Leg", false);
    Role R2 = new Role(2, "Saucy Fred", false);
    Role R3 = new Role(3, "Man under Home", false);

    int shots = 2;
    public Ranch(){
        super();
        RanchRoleList.add(R1);
        RanchRoleList.add(R2);
        RanchRoleList.add(R3);

    }


    public String getName(){return name;}
    public ArrayList<Room> getAdjRooms(){return RanchAdjList;}
    public ArrayList<Role> getRoomRoles(){return RanchRoleList;}
    public int getRoleNum(){return roleNum;}
    public int getAdjRoomNum(){return adjRoomNum;}

    public void addRoom(Room room){
        RanchAdjList.add(room);
    }
    public Scene getScene(){return movie;}
    public int getShots(){return shots;}
    public void setShots(int shots){this.shots =shots;}
    public void setScene(Scene scene){
        movie = scene;
    }
}