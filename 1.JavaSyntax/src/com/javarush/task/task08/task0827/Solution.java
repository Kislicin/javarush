package com.javarush.task.task08.task0827;

import java.util.Date;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) {
        Date startYear = new Date();
        Date dateFromMain = new Date(date);
        startYear.setYear(dateFromMain.getYear());
        startYear.setMonth(0);
        startYear.setDate(1);
        startYear.setHours(0);
        startYear.setMinutes(0);
        startYear.setSeconds(0);
        long diff = dateFromMain.getTime() - startYear.getTime();
        int daysCount = (int)(diff / (24*60*60*1000));
        if (daysCount%2!=0){
            return true;
        } else {
            return false;
        }
    }
}
