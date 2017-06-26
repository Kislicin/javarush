package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int sum = 0;
        int a = 0;
        String b = "сумма";
        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));
        while (true) {
            String c = reader.readLine();
            if(c.equals(b)) {
                break;
            }
            a = Integer.parseInt(c);

            //int a = 0;
            sum += a;
            if(c.equals(b)) {
                break;
            }
        }
        System.out.print(sum);
        //напишите тут ваш код

    }
}
