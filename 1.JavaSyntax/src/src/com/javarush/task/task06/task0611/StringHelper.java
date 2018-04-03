package com.javarush.task.task06.task0611;

/* 
Класс StringHelper
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class StringHelper {
    public static String multiply(String s) {
        String result = "";
        int i = 0;
        for(i=0; i<5; i++){
            result+=s;
        }
        return result;
    }

    public static String multiply(String s, int count) {
        String result = "";
        int i = 0;
        for(i=0; i<count; i++){
            result+=s;
        }
        return result;
    }

    public static void main(String[] args) {

    }
}
