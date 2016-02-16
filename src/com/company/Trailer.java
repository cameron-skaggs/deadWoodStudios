package com.company;
import java.util.*;
/**
 * Created by skaggsc2 on 2/8/16.
 */
public class Trailer extends Room{
    int adjRoomNum = 3;
    Saloon saloon = new Saloon();
    MainStreet mainStreet = new MainStreet();
    Hotel hotel = new Hotel();
    String name = "Trailer";

    public Trailer(){
        super();
        trailerAdjList.add(saloon);
        trailerAdjList.add(mainStreet);
        trailerAdjList.add(hotel);
        }

    public ArrayList<Room> getAdjRooms(){
        return trailerAdjList;
    }

    public String getName(){
        return name;
    }
    public int getAdjRoomNum(){
        return adjRoomNum;
    }
}