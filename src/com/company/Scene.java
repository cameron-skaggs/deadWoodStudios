package com.company;

/**
 * Created by skaggsc2 on 2/5/16.
 */
public abstract class Scene {

    boolean complete;
    int budget;
    Role sceneRole;
    String name;

    public void setComplete(boolean complete){}
    public boolean isComplete(){return complete;}
    public int getBudget(){return budget;}
    public String getName(){return name;}

}
