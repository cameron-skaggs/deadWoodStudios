package com.company;

/**
 * Created by skaggsc2 on 2/5/16.
 */
public class Day{


    private static int dayNum;
    public static int dayCount = 1;

    public static void setDayNum(int day){
        dayNum = day;
    }

    public static int getDayNum() {return dayNum;}

    public static int getDayCount(){return dayCount;}
}
