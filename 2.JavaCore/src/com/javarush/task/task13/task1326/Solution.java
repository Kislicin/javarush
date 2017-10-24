package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Scanner scanner = new Scanner(new FileInputStream(reader.readLine()));
        int num;
        List<Integer> numbers = new ArrayList<>();
        while (scanner.hasNextInt()){
            num = scanner.nextInt();
            if(num % 2 == 0){
                numbers.add(num);
            }
        }
        scanner.close();
        reader.close();
        //Collections.sort(numbers); - как вариант!
        for (int i = 0; i<numbers.size()-1; i++){
            for (int j = 0; j<numbers.size()-1; j++){
                if (numbers.get(j)>numbers.get(j+1)){
                    int tmp = numbers.get(j+1);
                    numbers.set(j+1, numbers.get(j));
                    numbers.set(j, tmp);
                }
            }
        }
        for (Integer ar : numbers){
            System.out.println(ar);
        }
    }
}
