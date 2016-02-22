package com.company;
import java.util.*;

/**
 * Created by skaggsc2 on 2/19/16.
 */
class Movie extends Scene {

    int budget = 3;
    boolean complete = false;
    String name = "movie";
    Role role1 = new Role(1, "Some Role", true);

    public void setComplete(boolean complete){}
    public boolean isComplete(){return complete;}
    public int getBudget(){return budget;}
    public String getName(){return name;}
}
