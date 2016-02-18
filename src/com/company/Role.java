package com.company;

/**
 * Created by skaggsc2 on 2/5/16.
 */
public class Role {
    int roleRank;
    String name;
    boolean inUSe =false;
    boolean onCard = false;

    public Role(int roleRank, String name, boolean onCard){

        this.roleRank = roleRank;
        this.name = name;
        this.onCard = onCard;
    }

    public String getName(){return name;}

    public int getRoleRank(){return roleRank;}

    public boolean isInUSe(){return inUSe;}

    public void setInUSe(boolean inUSe){
        this.inUSe = inUSe;
    }
}
