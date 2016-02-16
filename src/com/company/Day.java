package com.company;

/**
 * Created by skaggsc2 on 2/5/16.
 */
public class Day{

    private int dayCount = 0;
    public static int DayNum;

    public static void setDayNum(int day){
        DayNum = day;
    }
    public void endDay(int sceneCount){
        if (sceneCount == 0){
            dayCount += 1;
        }
    }
}
