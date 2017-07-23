package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> maxList = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maxPos = 1;
        for (int i = 0; i<10; i++){
            list.add(Integer.parseInt(reader.readLine()));
        }
        for (int i = 0; i<list.size(); i++){
            if ((i+1) != list.size()) {
                if (list.get(i) == list.get(i + 1))
                    maxPos++;
            }
        }
        System.out.println(maxPos);
    }
}