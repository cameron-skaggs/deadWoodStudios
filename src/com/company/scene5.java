package com.company;

import java.util.ArrayList;

/**
 * Created by skaggsc2 on 2/21/16.
 */
public class scene5 extends Scene {
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

    ArrayList<Role> roleArrayList= new ArrayList<Role>();
    public ArrayList<Role> getRoleArrayList(){return roleArrayList;}


    public scene5() {
        this.scenename = "Ol' Shooter and Little Doll";
        this.role1 = "Sleeping Man";
        this.role2 = "Man with Pig";
        this.role3 = "Shooter";
        this.role1int = 1;
        this.role2int = 2;
        this.role3int = 4;
        this.budget = 4;

        Role1 = new Role(role1int, role1, true);
        Role2 = new Role(role2int, role2, true);
        Role3 = new Role(role3int, role3, true);
        roleArrayList.add(Role1);
        roleArrayList.add(Role2);
    }

    public void setComplete(boolean complete){}
    public boolean isComplete(){return complete;}
    public int getBudget(){return budget;}
    public String getName(){return scenename;}
}
