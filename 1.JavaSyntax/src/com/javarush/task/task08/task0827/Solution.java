package com.javarush.task.task08.task0827;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) throws ParseException {
        SimpleDateFormat formater = new SimpleDateFormat("MM d yyyy", Locale.US);
        Date inputDate = formater.parse(date);
        Date startYear = new Date(inputDate.getYear(), 0, 0);
        long interval = inputDate.getTime() - startYear.getTime();
        long m = 1000*24*60*60;
        System.out.println(dateFromNY.getTime()/(24*60*60*1000));

        return true;
    }
}
