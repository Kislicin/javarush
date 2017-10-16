package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        FileWriter fw = new FileWriter(fileName);
        BufferedWriter bw = new BufferedWriter(fw);
        String line = null;
        do {
            line = reader.readLine();
            bw.write(line);
            bw.newLine();
        }
        while (!line.equals("exit"));
        bw.close();
        fw.close();
    }
}
