package com.javarush.task.task10.task1019;

import java.io.*;
import java.util.HashMap;

/* 
Функциональности маловато!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<Integer, String> map = new HashMap<>();
        int id = Integer.parseInt(reader.readLine());
        String name = reader.readLine();

        map.put(id,name);

        System.out.println("Id=" + id + " Name=" + name);
    }
}
