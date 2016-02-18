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
    /*
    public void endDay(int sceneCount){
        if (sceneCount == 0){
            dayCount += 1;
        }
    }*/
    public static int getDayCount(){return dayCount;}
}
