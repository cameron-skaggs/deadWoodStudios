package com.company;

import java.util.ArrayList;

/**
 * Created by skaggsc2 on 2/8/16.
 */
public class Saloon extends Room{

    int adjRoomNum = 3;
    int roleNum = 2;
    Role WIRD = new Role(2, "Woman in Red Dress", false);
    Role RF = new Role(1, "Relectant Farmer", false);
    int shots = 2;
    String name = "Saloon";
    Movie movie = new Movie();

    public Saloon(){
        super();
        saloonRoleList.add(WIRD);
        saloonRoleList.add(RF);
    }
    public ArrayList<Room> getAdjRooms(){return saloonAdjList;}
    public String getName(){return name;}
    public ArrayList<Role> getRoomRoles(){return saloonRoleList;}
    public int getRoleNum(){return roleNum;}
    public int getAdjRoomNum(){return adjRoomNum;}
    public void addRoom(Room room){saloonAdjList.add(room);}
    public int getShots(){return shots;}
    public Scene getScene(){return movie;}

}