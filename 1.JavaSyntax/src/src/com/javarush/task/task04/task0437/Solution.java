package com.javarush.task.task04.task0437;


/* 
Треугольник из восьмерок
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int n;
        int m;
        int i = 0;

        for (m=1;m<=10; m++){
            i++;
            for (n=1;n<=i;n++) {
                System.out.print("8");
            }
            System.out.println();
        }

    }
}
