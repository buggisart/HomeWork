package org.example;

public class NumberInPowerCalculator {
    public static int calculatePower(int num, int power) {
        int result = 1;
        for (int i = 0; i < power; i++) {
            result *= num;
        }
        return result;
    }
}
