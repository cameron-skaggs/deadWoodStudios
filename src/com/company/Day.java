package com.company;
import java.util.*;
/**
 * Created by skaggsc2 on 2/5/16.
 */
/*public class Day{


    private static int dayNum;
    public static int dayCount = 1;

    public static void setDayNum(int day){
        dayNum = day;
    }

    public static int getDayNum() {return dayNum;}

    public static int getDayCount(){return dayCount;}
}*/
public class Day {

    private static int dayNum;
    public static int dayCount = 1;

    public static void setDayNum(int day){
        dayNum = day;
    }

    public static int getDayNum() {
        return dayNum;
    }

    public static int getDayCount(){
        return dayCount;
    }

    public static void printWinner(Player winner, int winPoints) {
        System.out.println("The winner of DeadWood is " + winner.getPlayerName()
                + " with the grand total of " + winPoints + " points!");
        System.out.println("Congratulations, " + winner.getPlayerName());
        System.out.println("Everyone else: Better luck next time!");
    }

    public static void determineWinner(ArrayList<Player> playerArrayList, int playerNum) {
        Player currentWinner = playerArrayList.get(0);
        int dollarPoints = (int) currentWinner.getMoney() * 1;
        int rankPoints = (int) currentWinner.getRank() * 5;
        int winPoints = dollarPoints + rankPoints;
        int currDollarPoints;
        int currRankPoints;
        int prevDollarPoints;
        int prevRankPoints = 0;
        for(int i = 1; i < playerNum; i++) {
            currDollarPoints = (int) playerArrayList.get(i).getMoney() * 1;
            currRankPoints = (int) playerArrayList.get(i).getRank() * 5;
            prevDollarPoints = (int) playerArrayList.get(i-1).getMoney() * 1;
            prevDollarPoints = (int) playerArrayList.get(i-1).getRank() * 5;
            if ((currDollarPoints+currRankPoints) > (prevDollarPoints+prevRankPoints)) {
                winPoints = currDollarPoints+currRankPoints;
                currentWinner = playerArrayList.get(i);
            }

        }
        printWinner(currentWinner, winPoints);
    }

}
