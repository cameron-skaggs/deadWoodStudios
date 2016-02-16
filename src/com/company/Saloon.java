package com.company;

import java.util.ArrayList;

/**
 * Created by skaggsc2 on 2/8/16.
 */
public class Saloon extends Room{

    MainStreet mainStreet = new MainStreet();
    Hotel hotel = new Hotel();
    //Trailer trailer = new Trailer();
    String name = "Saloon";

    public Saloon(){
        super();

     //   saloonAdjList.add(trailer);
        saloonAdjList.add(mainStreet);
        saloonAdjList.add(hotel);

    }
    public String getName(){
        return name;
    }

}