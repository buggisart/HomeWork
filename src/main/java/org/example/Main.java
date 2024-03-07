package org.example;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        int a = 0;
        a = new A().increment(a);
        if (a != 1) {
            throw new RuntimeException("Expected a to be 1");
        }

    }
}