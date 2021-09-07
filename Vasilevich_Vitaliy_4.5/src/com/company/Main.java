package com.company;

import java.util.Scanner;

/* Найти сумму элементов на главной диагонали матрицы n*n.
 Число n вводится пользователем с клавиатуры.*/
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число n: ");
        int n = scanner.nextInt();
        int[][] array = new int[n][n];
        System.out.println("<---------------->");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = (int) (Math.random() * 10);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("<---------------->");
        int s = 0;
        for (int i = 0; i < array.length; ++i) {
            for (int j = 0; j < array[i].length; ++j) {
                if (i == j) {
                    s += array[i][j];
                }
            }
        }
        System.out.println("Сумма элементов диагонали: " + s);
    }
}


