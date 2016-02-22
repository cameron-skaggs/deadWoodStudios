package com.company;
import java.util.ArrayList;

/**
 * Created by skaggsc2 on 2/8/16.
 */
class Bank extends Room{

    int roleNum = 2;
    int adjRoomNum = 4;
    String name = "Bank";
    //Film movie = new Film();
    Scene scene; //Movie should be scene type not Film\

    Role R1 = new Role(2, "Suspicious Gentleman", false);
    Role R2 = new Role(3, "Flustered Teller", false);
    //ArrayList<Role> BankRoleList; this will be initialized in the Room class so you don't need it (see Room class).

    int shots = 1;
    public Bank(){
        super();
        bankRoleList.add(R1);
        bankRoleList.add(R2);

    }
    public String getName(){return name;}
    public ArrayList<Room> getAdjRooms(){return bankAdjList;} //returns the respected adjacency list
    public ArrayList<Role> getRoomRoles(){return bankRoleList;}
    public int getRoleNum(){return roleNum;}
    public int getAdjRoomNum(){return adjRoomNum;}
    public void addRoom(Room room){hotelAdjList.add(room);}
    public Scene getScene(){return scene;}
    //I forgot setScene. You can just copy this
    public void setScene(Scene scene){
        this.scene = scene;
    }
    public int getShots(){return shots;}
    public void setShots(int shots){this.shots =shots;}

}

