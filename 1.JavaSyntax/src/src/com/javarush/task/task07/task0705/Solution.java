package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] ch = new int[20];
        int[] ch1 = new int[10];
        int[] ch2 = new int[10];
        int j = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for(int i=0;i<ch.length; i++){
            ch[i] = Integer.parseInt(reader.readLine());
        }
        for(int i=0; i<ch.length/2; i++){
            ch1[i] = ch[i];
        }
        for(int i=ch.length/2; i<ch.length; i++){
            ch2[j] = ch[i];
            j++;
        }
        for(int i=0; i<ch2.length; i++){
            System.out.println(ch2[i]);
        }
    }
}
