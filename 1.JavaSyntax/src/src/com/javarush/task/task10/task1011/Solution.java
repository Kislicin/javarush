package com.javarush.task.task10.task1011;

/* 
Большая зарплата
*/

public class Solution {
    public static void main(String[] args) {
        String s = "Я не хочу изучать Java, я хочу большую зарплату";
        char[] a = s.toCharArray();
        for (int i=0; i<40; i++){
            for (int j=i;j<a.length;j++){
                System.out.print(a[j]);
            }
            System.out.println();
        }
    }

}

