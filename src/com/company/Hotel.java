package com.company;

import java.util.ArrayList;

/**
 * Created by skaggsc2 on 2/8/16.
 */
class Hotel extends Room{

    int adjRoomNum = 3;
    //String bank;
    //Church church;
    Trailer trailer;
    String name = "Hotel";
    public Hotel(){
        super();

        hotelAdjList.add(trailer);
      //  hotelAdjList.add(bank);
      //  hotelAdjList.add(church);
    }
    public ArrayList<Room> getAdjRooms(){
        return hotelAdjList;
    }
    public String getName(){
        return name;
    }
    public int getAdjRoomNum(){
        return adjRoomNum;
    }
}