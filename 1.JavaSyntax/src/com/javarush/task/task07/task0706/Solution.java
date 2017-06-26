package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/
//Я знаю, что задачу можно решить гораздо проще и изящнее, я сам усложнил себе задачу, что бы закрепить массивы и циклы лишний раз
public class Solution {
    public static void main(String[] args) throws Exception {
        int[] ch = new int[15];
        int[] chet = new int[8];
        int[] nechet = new int[7];
        int sum_chet = 0;
        int sum_nechet = 0;
        int j = 0;
        int k = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for(int i=0; i<ch.length; i++){
            ch[i] = Integer.parseInt(reader.readLine());
        }
        for(int i=0; i<ch.length; i++){
            if(i%2==0){
                chet[j] = ch[i];
                j++;
            } else {
                nechet[k] = ch[i];
                k++;
            }
        }
        for(int i=0; i<chet.length; i++){
            sum_chet+=chet[i];
        }
        for(int i=0; i<nechet.length; i++){
            sum_nechet+=nechet[i];
        }
        if(sum_chet>sum_nechet){
            System.out.println("В домах с четными номерами проживает больше жителей.");
        } else {
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
        }

    }
}
