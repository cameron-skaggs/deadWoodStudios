package com.company;

/**
 * Created by skaggsc2 on 2/21/16.
 */
public class scene29 extends Scene {
    boolean complete = false;
    public String scenename;
    public String role1;
    public String role2;
    public String role3;
    public int role1int;
    public int role2int;
    public int role3int;
    public int budget;
    public Room currentroom;
    Role Role1;
    Role Role2;

    public scene29() {
        this.scenename = "Picante Sauce Commercial";
        this.role1 = "Bewhisker'd Cowpoke";
        this.role2 = "Dog";

        this.role1int = 3;
        this.role2int = 5;

        this.budget = 2;


        Role1 = new Role(role1int, role1, true);
        Role2 = new Role(role1int, role1, true);
    }

    public void setComplete(boolean complete){}
    public boolean isComplete(){return complete;}
    public int getBudget(){return budget;}
    public String getName(){return name;}

}
