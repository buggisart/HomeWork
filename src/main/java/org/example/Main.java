package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        int a = 0;
        a = new A().increment(a);
        if (a != 1) {
            throw new RuntimeException("Expected a to be 1");
        }

Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество чисел в массиве");
        int arrayLength = scanner.nextInt();
        System.out.println("Введите числа по порядку, которые должны быть в массиве");
        int[] array = new int[arrayLength];
        int sum = 0;
        for (int i = 0; i < arrayLength; i++) {
            int arrayElement = scanner.nextInt();
            array[i] = arrayElement;
            sum += arrayElement;
        }
        System.out.println("Сумма всех чисел в массиве равна: " + sum);

    }

}