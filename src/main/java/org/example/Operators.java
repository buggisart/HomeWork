package org.example;

public class Operators {

    public static void main(String[] args) {
        int a = 2;
        int b = a++ * (--a * a);

        System.out.println("1st task" + "\n" + "b value is: " + b);
        int j = 256;
        int i = j>>7;

        System.out.println("2nd task" + "\n" + "i value is: " + i);

//        int c = a++;
//        int d = ++a;
        int s = ++a + 1;
//        System.out.println(c);
//        System.out.println(d);
        System.out.println(a);
        System.out.println(s);

    }


}
