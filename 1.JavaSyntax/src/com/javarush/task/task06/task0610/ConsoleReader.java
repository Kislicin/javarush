package com.javarush.task.task06.task0610;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Класс ConsoleReader
*/

public class ConsoleReader {
    public static String readString() throws Exception {
       BufferedReader ui = new BufferedReader(new InputStreamReader(System.in));
       String s = ui.readLine();
       return s;
    }

    public static int readInt() throws Exception {
        BufferedReader ui = new BufferedReader(new InputStreamReader(System.in));
        String s = ui.readLine();
        int i = Integer.parseInt(s);
        return i;
    }

    public static double readDouble() throws Exception {
        BufferedReader ui = new BufferedReader(new InputStreamReader(System.in));
        String s = ui.readLine();
        double n = Double.parseDouble(s);
        return n;
    }

    public static boolean readBoolean() throws Exception {
        BufferedReader ui = new BufferedReader(new InputStreamReader(System.in));
        String b = ui.readLine();

        return Boolean.parseBoolean(b);

    }

    public static void main(String[] args) {

    }
}
