package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        char[] textAr = reader.readLine().toCharArray();
        String glas="", soglas="";
        for (int i=0; i<textAr.length; i++){
            if (Character.toString(textAr[i]).equals(" ")){
                continue;
            }
            if (isVowel(textAr[i])){
                glas+= textAr[i] + " ";
            } else {
                soglas+= textAr[i] + " ";
            }
        }
        System.out.println(glas);
        System.out.println(soglas);
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   // ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}