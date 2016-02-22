package com.company;

/**
 * Created by skaggsc2 on 2/21/16.
 */
public class scene8 extends Scene {
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


    public scene8(){
        this.scenename = "Disaster at Flying J";
        this.role1 = "Piano Player";
        this.role2 = "Man in Turban";
        this.role3 = "Falls on Hoe";
        this.role1int = 2;
        this.role2int = 3;
        this.role3int = 4;
        this.budget = 5;

        Role1 = new Role( role1int , role1 , true );
        Role2 = new Role( role2int , role2 , true );
        Role3 = new Role( role3int , role3 , true );
    }

    public void setComplete(boolean complete){}
    public boolean isComplete(){return complete;}
    public int getBudget(){return budget;}
    public String getName(){return name;}

}
