package com.company;

/**
 * Created by skaggsc2 on 2/19/16.
 */
class Production extends Scene {
    int budget = 6;
    boolean complete = false;
    String name = "production";

    public void setComplete(boolean complete){}
    public boolean isComplete(){return complete;}
    public int getBudget(){return budget;}
    public String getName(){return name;}
}
