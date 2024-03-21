package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int a = 0;
        a = new A().increment(a);
        if (a != 1) {
            throw new RuntimeException("Expected a to be 1");
        }

        // Задание с одинарным массивом
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

        // Задание с двумерным массивом
        // Тут пока прошу не смотреть, я в процессе решения
        System.out.println("Введите количество массивов в двумерном массиве");
        int amountOfArrays = scanner.nextInt();
        System.out.println("Введите количество элементов в одном массиве");
        int amountOfElements = scanner.nextInt();
        int[][] twoDimensionalArray = new int[amountOfArrays][amountOfElements];
        int sumBig = 0;
        int sumSmall = 0;
        System.out.println("Введите числа через пробел, которые должны быть в " + " массиве");
        for (int j = 0; j < amountOfArrays; j++) {
            String elementsOfArray = scanner.next();
            String[] test = elementsOfArray.split(" ");
            int[] singleArray = new int[test.length];
            for (int i = 0; i < singleArray.length; i++) {
                singleArray[i] = Integer.parseInt(test[i]);
                sumSmall += singleArray[i];
            }
            sumBig += sumSmall;
        }
        System.out.println(sumBig);

        /* Задание с лямбда выражением, анонимним классом
        и имплементациями интерфейсов*/
        // Реализация функционального интерфейса Animal через лямбда выражение и вызов его метода через ссылку
        Animal animal = () -> System.out.println("Animal runs");
        animal.run();

        // Создание анонимного класса Mammal и вызов его методов через инстанс
        Mammal mammal = new Mammal() {
        @Override
        public void breastfeed() {
            System.out.println("Feed with breast");
        }
        @Override
        public void breatheWithLungs() {
            System.out.println("Breathing with lungs");
        }
        };
        mammal.breastfeed();
        mammal.breatheWithLungs();
    }


    public static class A {
        public int increment(int a) {
            return ++a;
        }
    }

}