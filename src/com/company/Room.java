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
    static ArrayList<Room> SaloonAdjList = new ArrayList<Room>();
    static ArrayList<Room> hotelAdjList = new ArrayList<Room>();
    static ArrayList<Room> MainStreetAdjList = new ArrayList<Room>();
    static ArrayList<Room> BankAdjList = new ArrayList<Room>();
    static ArrayList<Room> churchAdjList = new ArrayList<Room>();;
    static ArrayList<Room> GeneralStoreAdjList=new ArrayList<Room>();
    static ArrayList<Room> jailAdjList=new ArrayList<Room>();
    static ArrayList<Room> RanchAdjList=new ArrayList<Room>();
    static ArrayList<Room> SecretHideoutAdjList=new ArrayList<Room>();
    static ArrayList<Room> TrainStationAdjList=new ArrayList<Room>();
    static ArrayList<Room> castingAdjList=new ArrayList<Room>();
    /*(2)*/
    static ArrayList<Role> trailerRoleList = new ArrayList<Role>();
    static ArrayList<Role> SaloonRoleList = new ArrayList<Role>();
    static ArrayList<Role> hotelRoleList = new ArrayList<Role>();
    static ArrayList<Role> MainStreetRoleList = new ArrayList<Role>();
    static ArrayList<Role> BankRoleList=new ArrayList<Role>();
    static ArrayList<Role> churchRoleList=new ArrayList<Role>();
    static ArrayList<Role> GeneralStoreRoleList=new ArrayList<Role>();
    static ArrayList<Role> jailRoleList=new ArrayList<Role>();
    static ArrayList<Role> RanchRoleList=new ArrayList<Role>();
    static ArrayList<Role> SecretHideoutRoleList=new ArrayList<Role>();
    static ArrayList<Role> TrainStationRoleList=new ArrayList<Role>();
    static ArrayList<Role> castingRoleList=new ArrayList<Role>();
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
    public void setScene(Scene scene){}
}

