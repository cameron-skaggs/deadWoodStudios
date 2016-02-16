package com.company;

import java.util.ArrayList;

/**
 * Created by skaggsc2 on 2/8/16.
 */
public class Saloon extends Room{

   // Trailer trailer = new Trailer();
    MainStreet mainStreet = new MainStreet();
    Hotel hotel = new Hotel();
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