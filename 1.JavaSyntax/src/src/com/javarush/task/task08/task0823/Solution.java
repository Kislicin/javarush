package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.Character.toUpperCase;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        char[] arr = s.toCharArray();
        arr[0] = toUpperCase(arr[0]);
        for (int i = 0; i < arr.length - 1; i++) {
            if ((arr[i] == ' ') && arr[i + 1] != ' ' ) {
                arr[i + 1] = toUpperCase(arr[i + 1]);
            }
        }
        String out = new String(arr);
        System.out.println(out);
    }
}
