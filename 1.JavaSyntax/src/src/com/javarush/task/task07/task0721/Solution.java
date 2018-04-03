package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] intArray = new int[20];
        int maximum;
        int minimum;

        for (int i=0; i<20; i++){
            intArray[i] = Integer.parseInt(reader.readLine());
        }

        maximum = intArray[0];
        minimum = intArray[0];

        for (int i=0; i<20; i++){
            if (maximum<intArray[i]){
                maximum = intArray[i];
            }
            if (minimum>intArray[i]){
                minimum = intArray[i];
            }
        }

        System.out.println(maximum);
        System.out.println(minimum);
    }
}
