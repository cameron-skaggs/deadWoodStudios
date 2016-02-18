package com.company;
import java.util.*;

/**
 * Created by skaggsc2 on 2/5/16.
 */
/*
Room Abstract Class has a certain amount of scenes and
 */
public abstract class Room {

    static ArrayList<Room> trailerAdjList = new ArrayList<Room>();
    static ArrayList<Room> saloonAdjList = new ArrayList<Room>();
    static ArrayList<Room> hotelAdjList = new ArrayList<Room>();
    static ArrayList<Room> mainStAdjList = new ArrayList<Room>();

    static ArrayList<Role> trailerRoleList = new ArrayList<Role>();
    static ArrayList<Role> saloonRoleList = new ArrayList<Role>();
    static ArrayList<Role> hotelRoleList = new ArrayList<Role>();
    static ArrayList<Role> mainStRikeList = new ArrayList<Role>();

    public Room(){}

    public ArrayList getAdjRooms(){return null;}

    public String getName(){
        return " ";
    }

    public int getAdjRoomNum(){
        return 0;
    }

    public ArrayList<Role> getRoomRoles(){return null;}

    public int getRoleNum(){return 0;}

}

