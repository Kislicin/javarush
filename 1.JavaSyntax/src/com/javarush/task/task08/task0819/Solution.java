package com.javarush.task.task08.task0819;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Set из котов
*/

public class Solution {

    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Iterator it = cats.iterator();
        cats.remove(it.next());
        //напишите тут ваш код. step 3 - пункт 3
        printCats(cats);
    }

    public static Set<Cat> createCats() {
        //напишите тут ваш код. step 2 - пункт 2
        Set<Cat> cats = new HashSet();
        cats.add(new Cat());
        cats.add(new Cat());
        cats.add(new Cat());

        return (Set)cats;
    }

    public static void printCats(Set<Cat> cats) {
        // step 4 - пункт 4
        Iterator it = cats.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }

    // step 1 - пункт 1
    public static class Cat{

    }
}
