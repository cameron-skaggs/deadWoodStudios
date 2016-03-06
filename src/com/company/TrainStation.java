package com.company;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.Label;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by skaggsc2 on 2/8/16.
 */
class TrainStation extends Room{

    int roleNum = 4;
    int adjRoomNum = 4;
    String name = "Train Station";
    Scene movie;
    Role R1 = new Role(1, "Crusty Prospector", false);
    Role R2 = new Role(1, "Dragged by Train", false);
    Role R3 = new Role(2, "Preacher with Bag", false);
    Role R4 = new Role(4, "Cyrus the Gunfighter", false);
    int shots = 3;
    public TrainStation(){
        super();
        TrainStationRoleList.add(R1);
        TrainStationRoleList.add(R2);
        TrainStationRoleList.add(R3);
        TrainStationRoleList.add(R4);
    }
    public String getName(){return name;}
    public ArrayList<Room> getAdjRooms(){return TrainStationAdjList;}
    public ArrayList<Role> getRoomRoles(){return TrainStationRoleList;}
    public int getRoleNum(){return roleNum;}
    public int getAdjRoomNum(){return adjRoomNum;}
    public void addRoom(Room room){TrainStationAdjList.add(room);}
    public Scene getScene(){return movie;}
    public int getShots(){return shots;}
    public void setShots(int shots){this.shots =shots;}
    public void setScene(Scene scene){
        movie = scene;
    }

 }
