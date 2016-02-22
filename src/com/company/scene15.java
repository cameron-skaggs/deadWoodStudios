package com.company;

/**
 * Created by skaggsc2 on 2/21/16.
 */
public class scene15 extends Scene {
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
    Role Role3;

    public scene15() {
        this.scenename = "Thirteen the Hard Way";
        this.role1 = "Very Wet Man";
        this.role2 = "Dejected Housewife";
        this.role3 = "Man with Box";
        this.role1int = 1;
        this.role2int = 4;
        this.role3int = 5;
        this.budget = 5;


        Role1 = new Role(role1int, role1, true);
        Role2 = new Role(role2int, role2, true);
        Role3 = new Role(role3int, role3, true);
    }
    public void setComplete(boolean complete){}
    public boolean isComplete(){return complete;}
    public int getBudget(){return budget;}
    public String getName(){return name;}
}