package com.company;

import java.util.ArrayList;

/**
 * Created by skaggsc2 on 2/8/16.
 */
public class Saloon extends Room{

    int roleNum = 2;
    Role WIRD = new Role(2, "Woman in Red Dress", false);
    Role RF = new Role(1, "Relectant Farmer", false);


    MainStreet mainStreet = new MainStreet();
    Hotel hotel = new Hotel();
    //Trailer trailer = new Trailer();
    String name = "Saloon";

    public Saloon(){
        super();

     //   saloonAdjList.add(trailer);
        saloonAdjList.add(mainStreet);
        saloonAdjList.add(hotel);

        saloonRoleList.add(WIRD);
        saloonRoleList.add(RF);


    }
    public ArrayList<Room> getAdjRooms(){
        return saloonAdjList;
    }
    public String getName(){
        return name;
    }
    public ArrayList<Role> getRoomRoles(){return saloonRoleList;}
    public int getRoleNum(){return roleNum;}


}