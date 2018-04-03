package com.javarush.task.task15.task1507;

/* 
ООП - Перегрузка
*/

public class Solution {
    public static void main(String[] args) {
        printMatrix(2, 3, "8");
    }

    public static void printMatrix(int m, int n, String value) {
        System.out.println("Заполняем объектами String");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(int m, int n, Object value) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }

    public static void printMatrix(double m, int n, String value) {
        printMatrix((int)m, n, (Object) value);
    }

    public static void printMatrix(double m, double n, String value) {
        printMatrix((int)m, (int)n, (Object) value);
    }

    public static void printMatrix(int m, double n, String value) {
        printMatrix(m, (int)n, (Object) value);
    }

    public static void printMatrix(double m, double n) {
        printMatrix((int)m, (int)n, "8");
    }

    public static void printMatrix(int m, int n) {
        printMatrix((int)m, (int)n, "8");
    }

    public static void printMatrix(int m, String value) {
        printMatrix((int)m, 1, value);
    }

    public static void printMatrix(double m, String value) {
        printMatrix((int)m, 1, value);
    }

    public static void printMatrix(int m, Object value) {
        printMatrix((int)m, 1, value);
    }
}
