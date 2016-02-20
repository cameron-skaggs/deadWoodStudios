package com.company;

import java.util.ArrayList;

/**
 * Created by skaggsc2 on 2/14/16.
 */
public class MainStreet extends Room {

    int adjRoomNum = 4;
    int roleNum = 4;
    Role RW = new Role(1, "Railroad Worker", false);
    Role FOR = new Role(2, "Falls off Roof", false);
    Role WIBD = new Role(2, "Woman in Black Dress", false);
    Role MM = new Role(4, "Mayor McGinty", false);
    String name =  "Main Street";
    Production movie = new Production();

    public MainStreet(){
        super();
        mainStRoleList.add(RW);
        mainStRoleList.add(FOR);
        mainStRoleList.add(WIBD);
        mainStRoleList.add(MM);
    }

    public String getName(){return name;}
    public ArrayList<Room> getAdjRooms(){return mainStAdjList;}
    public ArrayList<Role> getRoomRoles(){return mainStRoleList;}
    public int getRoleNum(){return roleNum;}
    public int getAdjRoomNum(){return adjRoomNum;}
    public void addRoom(Room room){mainStAdjList.add(room);}
    public Scene getScene(){return movie;}
}

