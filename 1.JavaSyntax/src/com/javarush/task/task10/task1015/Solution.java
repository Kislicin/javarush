package com.javarush.task.task10.task1015;

import java.util.ArrayList;

/* 
Массив списков строк
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        ArrayList<String>[] list = new ArrayList[2];
        ArrayList<String> podList = new ArrayList<>();
        podList.add("asdasd");
        podList.add("DDDDDDD");
        podList.add("WSGKJMSLGK");
        list[0] = podList;
        podList.clear();
        podList.add("LLFLLDF:GDFL:");
        podList.add("LLFLLDsfdsdfFL:");
        podList.add("sdfsdfsdfGDFL:");
        list[1] = podList;
        return list;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}