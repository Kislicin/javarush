package com.javarush.task.task09.task0921;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/* 
Метод в try..catch
*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        ArrayList<Integer> array = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            try {
                while (true) {
                    array.add(Integer.parseInt(reader.readLine()));
                }
            } catch (NumberFormatException e) {
                for (int j : array)
                {
                    System.out.println(j);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }


    }
}
