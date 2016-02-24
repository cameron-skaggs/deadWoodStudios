package com.company;
import java.util.ArrayList;
/**
 * Created by skaggsc2 on 2/22/16.
 */

class Jail extends Room{

    int roleNum = 2;
    int adjRoomNum = 3;
    String name = "Jail";
    Scene movie;
    Role R1 = new Role(2, "Prisoner in cell", false);
    Role R2 = new Role(3, "Feller in Irons", false);

    int shots = 1;
    public Jail(){
        super();
        jailRoleList.add(R1);
        jailRoleList.add(R2);
    }


    public String getName(){return name;}
    public ArrayList<Room> getAdjRooms(){return jailAdjList;}
    public ArrayList<Role> getRoomRoles(){return jailRoleList;}
    public int getRoleNum(){return roleNum;}
    public int getAdjRoomNum(){return adjRoomNum;}
    public void addRoom(Room room){jailAdjList.add(room);}
    public Scene getScene(){return movie;}
    public int getShots(){return shots;}
    public void setShots(int shots){this.shots =shots;}
    public void setScene(Scene scene){
        movie = scene;
    }
}