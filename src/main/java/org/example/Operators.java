package org.example;

public class Operators {

    public static void main(String[] args) {
        int a = 2;
        int b = a++ * (--a * a);

        System.out.println("1st task" + "\n" + "b value is: " + b);
        int j = 256;
        int i = j>>7;

        System.out.println("2nd task" + "\n" + "i value is: " + i);

    }


}
