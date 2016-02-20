package com.company;
import java.util.*;

/**
 * Created by skaggsc2 on 2/5/16.
 */
/*
Room Abstract Class:

(1) Initialize Adjacency Lists
(2) Initialize Role Lists
(3) Initialize abstract methods
 */
public abstract class Room {

    /* (1) */
    static ArrayList<Room> trailerAdjList = new ArrayList<Room>();
    static ArrayList<Room> saloonAdjList = new ArrayList<Room>();
    static ArrayList<Room> hotelAdjList = new ArrayList<Room>();
    static ArrayList<Room> mainStAdjList = new ArrayList<Room>();
    /*(2)*/
    static ArrayList<Role> trailerRoleList = new ArrayList<Role>();
    static ArrayList<Role> saloonRoleList = new ArrayList<Role>();
    static ArrayList<Role> hotelRoleList = new ArrayList<Role>();
    static ArrayList<Role> mainStRoleList = new ArrayList<Role>();
    /*(3)*/
    public Room(){}
    public ArrayList getAdjRooms(){return null;}
    public String getName(){return " ";}
    public int getAdjRoomNum(){return 0;}
    public ArrayList<Role> getRoomRoles(){return null;}
    public int getRoleNum(){return 0;}
    public void addRoom(Room room){}
    public int getShots(){return 0;}
    public void setShots(int shots){}
    public Scene getScene(){return null;}
}

