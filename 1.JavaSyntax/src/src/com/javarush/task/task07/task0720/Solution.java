package com.javarush.task.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Перестановочка подоспела
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        int n = Integer.parseInt(reader.readLine());
        int m = Integer.parseInt(reader.readLine());
        for (int i=0; i<n; i++){
            list.add(reader.readLine());
        }
        for (int i=0; i<m; i++){
            String s = list.get(0);
            list.remove(0);
            list.add(s);
        }
        for (String s : list) System.out.println(s);
    }
}
