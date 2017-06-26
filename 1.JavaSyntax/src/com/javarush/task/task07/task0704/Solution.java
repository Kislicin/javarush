package com.javarush.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Переверни массив
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] ch = new int[10];
        int[] rev = new int[ch.length];
        int j = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0; i<ch.length; i++){
            ch[i] = Integer.parseInt(reader.readLine());
        }
        for(int i = ch.length-1; i>=0; i--){
            rev[j] = ch[i];
            j++;
        }
        for(int i=0; i<rev.length; i++){
            System.out.println(rev[i]);
        }
    }
}

