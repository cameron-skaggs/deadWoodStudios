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
    static ArrayList<Room> bankAdjList;
    static ArrayList<Room> churchAdjList;
    static ArrayList<Room> generalStoreAdjList;
    static ArrayList<Room> jailAdjList;
    static ArrayList<Room> ranchAdjList;
    static ArrayList<Room> hideoutAdjList;
    static ArrayList<Room> stationAdjList;
    static ArrayList<Room> castingAdjList;
    /*(2)*/
    static ArrayList<Role> trailerRoleList = new ArrayList<Role>();
    static ArrayList<Role> saloonRoleList = new ArrayList<Role>();
    static ArrayList<Role> hotelRoleList = new ArrayList<Role>();
    static ArrayList<Role> mainStRoleList = new ArrayList<Role>();
    static ArrayList<Role> bankRoleList;
    static ArrayList<Role> churchRoleList;
    static ArrayList<Role> generalStoreRoleList;
    static ArrayList<Role> jailRoleList;
    static ArrayList<Role> ranchRoleList;
    static ArrayList<Role> hideoutRoleList;
    static ArrayList<Role> stationRoleList;
    static ArrayList<Role> castingRoleList;
    /*(3)*/
    public Room(){}
    public ArrayList getAdjRooms(){return null;}
    public String getName(){return " ";}
    public int getAdjRoomNum(){return 0;}
    public ArrayList<Role> getRoomRoles(){return trailerRoleList;}
    public int getRoleNum(){return 0;}
    public void addRoom(Room room){}
    public int getShots(){return 0;}
    public void setShots(int shots){}
    public Scene getScene(){return null;}
}

