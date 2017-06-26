package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        int sum = 0, kol=0;
        double ch = 0;
        Scanner ui = new Scanner(System.in);

        while (ch != -1){
            ch = ui.nextInt();
            if (ch == -1) break;
            sum += ch;
            kol += 1;
        }

        double res = sum/(double)kol;
        System.out.println(res);
    }
}

