package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> first = new ArrayList<Integer>();
        ArrayList<Integer> second = new ArrayList<Integer>();
        ArrayList<Integer> third = new ArrayList<Integer>();

        for (int i=0; i<20; i++){
            list.add(Integer.parseInt(reader.readLine()));
        }

        for(int i=0; i<list.size(); i++){
            if ((list.get(i)%2==0)&&(list.get(i)%3==0)){
                first.add(list.get(i));
                second.add(list.get(i));
                continue;
            }

            if (list.get(i)%3==0){
                first.add(list.get(i));
                continue;
            }

            if (list.get(i)%2==0){
                second.add(list.get(i));
                continue;
            }

            if ((list.get(i)%2!=0) && (list.get(i)%3!=0)){
                third.add(list.get(i));
            }
        }

        printList(first);
        printList(second);
        printList(third);
    }

    public static void printList(List<Integer> list) {
        for (int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
