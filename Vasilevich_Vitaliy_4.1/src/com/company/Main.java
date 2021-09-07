package com.company;

/*Создать последовательность случайных чисел,
найти и вывести наибольшее из них.
(случайные числа можно получить из класса Random)*/

public class Main {

    public static void main(String[] args) {
        int[] array = new int[10];
        /*  System.out.print("[");*/
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        int max = 0;
        for (int i = 0; i <= array.length - 1; i++) {
            if (array[i] > max)
                max = array[i];
        }
        System.out.println("Наибольшее из чисел: " + max);
    }
}

