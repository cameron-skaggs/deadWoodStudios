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
    //public class Trailer{};
    public Room(){
        }
    public ArrayList getAdjRooms(){
        return null;
    }

    public String getName(){
        return " ";
    }

    public int getAdjRoomNum(){
        return 0;
    }
/*
    public static Room arrangeRooms(Room type){

       if(type == saloon){
       }

        return type;
    }
*/

}

