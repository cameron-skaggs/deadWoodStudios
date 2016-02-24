package com.company;
import java.util.*;
/**
 * Created by skaggsc2 on 2/8/16.
 */
public class CastingOffice extends Room{

    int adjRoomNum = 3;

    String name = "Casting Office";

    public CastingOffice(){super();}

    public ArrayList<Room> getAdjRooms(){return castingAdjList;}
    public int getAdjRoomNum(){return adjRoomNum;}
    public String getName(){return name;}
    public ArrayList<Role> getRoomRoles() {return castingRoleList;}
    public void addRoom(Room room){castingAdjList.add(room);}
}