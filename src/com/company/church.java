package com.company;
import java.util.ArrayList;

/**
 * Created by skaggsc2 on 2/8/16.
 */
class Church extends Room{

    int roleNum = 2;
    int adjRoomNum = 3;
    String name = "Church";
    Scene movie;
    Role R1 = new Role(1, "Dead Person", false);
    Role R2 = new Role(2, "Crying Woman", false);

    int shots = 2;
    public Church(){
        super();
        churchRoleList.add(R1);
        churchRoleList.add(R2);

    }

    public String getName(){return name;}
    public ArrayList<Room> getAdjRooms(){return churchAdjList;}
    public ArrayList<Role> getRoomRoles(){return churchRoleList;}
    public int getRoleNum(){return roleNum;}
    public int getAdjRoomNum(){return adjRoomNum;}
    public void addRoom(Room room){churchAdjList.add(room);}
    public Scene getScene(){return movie;}
    public int getShots(){return shots;}
    public void setShots(int shots){this.shots =shots;}
    public void setScene(Scene scene){
        movie = scene;
    }
}