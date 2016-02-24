package com.company;

import java.util.ArrayList;

/**
 * Created by skaggsc2 on 2/8/16.
 */
class SecretHideout extends Room{

    int roleNum = 4;
    int adjRoomNum = 3;
    String name = "Secret Hideout";
    Scene movie;
    Role R1 = new Role(1, "Clumsy Pit Fighter", false);
    Role R2 = new Role(2, "Thug with knife", false);
    Role R3 = new Role(3, "Dangerous Tom", false);
    Role R4 = new Role(4, "Penny who is Lost", false);
    int shots = 3;
    public SecretHideout(){
        super();
        SecretHideoutRoleList.add(R1);
        SecretHideoutRoleList.add(R2);
        SecretHideoutRoleList.add(R3);
        SecretHideoutRoleList.add(R4);
    }

    public String getName(){return name;}
    public ArrayList<Room> getAdjRooms(){return SecretHideoutAdjList;}
    public ArrayList<Role> getRoomRoles(){return SecretHideoutRoleList;}
    public int getRoleNum(){return roleNum;}
    public int getAdjRoomNum(){return adjRoomNum;}
    public void addRoom(Room room){SecretHideoutAdjList.add(room);}
    public Scene getScene(){return movie;}
    public int getShots(){return shots;}
    public void setShots(int shots){this.shots =shots;}
    public void setScene(Scene scene){movie = scene;}
}