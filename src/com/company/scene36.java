package com.company;

import java.util.ArrayList;

/**
 * Created by skaggsc2 on 2/21/16.
 */
public class scene36 extends Scene {
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
    ArrayList<Role> roleArrayList;
    public ArrayList<Role> getRoleArrayList(){return roleArrayList;}

    public scene36() {
        this.scenename = "Over Yonder Hill";
        this.role1 = "Elouise";
        this.role2 = "Benjamin";

        this.role1int = 4;
        this.role2int = 5;

        this.budget = 4;


        Role1 = new Role(role1int, role1, true);
        Role2 = new Role(role1int, role1, true);
        roleArrayList.add(Role1);
        roleArrayList.add(Role2);
    }
    public void setComplete(boolean complete){}
    public boolean isComplete(){return complete;}
    public int getBudget(){return budget;}
    public String getName(){return name;}
}