package com.company;

import java.util.ArrayList;

/**
 * Created by skaggsc2 on 2/8/16.
 */
class GeneralStore extends Room{

    int roleNum = 2;
    int adjRoomNum = 4;
    String name = "General Store";
    Scene movie;
    Role R1 = new Role(1, "Man in Overalls", false);
    Role R2 = new Role(3, "Mister Keach", false);

    int shots = 2;
    public GeneralStore(){
        super();
        GeneralStoreRoleList.add(R1);
        GeneralStoreRoleList.add(R2);

    }

    public String getName(){return name;}
    public ArrayList<Room> getAdjRooms(){return GeneralStoreAdjList;}
    public ArrayList<Role> getRoomRoles(){return GeneralStoreRoleList;}
    public int getRoleNum(){return roleNum;}
    public int getAdjRoomNum(){return adjRoomNum;}
    public void addRoom(Room room){GeneralStoreAdjList.add(room);}
    public Scene getScene(){return movie;}
    public int getShots(){return shots;}
    public void setShots(int shots){this.shots =shots;}
    public void setScene(Scene scene){
        movie = scene;
    }
}