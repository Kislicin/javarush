package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String[] mas = new String[10];
        int[] ch = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for(int i=0; i<mas.length; i++){
            mas[i] = reader.readLine();
            ch[i] = mas[i].length();
        }

        for(int i=0; i<ch.length; i++){
            System.out.println(ch[i]);
        }


    }
}
