package com.company;

/**
 * Created by skaggsc2 on 2/21/16.
 */
public class scene32 extends Scene {
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

    public scene32() {
        this.scenename = "Go West, You!";
        this.role1 = "Ex-Convict";
        this.role2 = "Man with Onions";

        this.role1int = 4;
        this.role2int = 6;

        this.budget = 3;


        Role1 = new Role(role1int, role1, true);
        Role2 = new Role(role1int, role1, true);
    }
    public void setComplete(boolean complete){}
    public boolean isComplete(){return complete;}
    public int getBudget(){return budget;}
    public String getName(){return name;}

}
