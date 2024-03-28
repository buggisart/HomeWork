package org.example;

public class NumberInPowerCalculator {
    public static int calculatePower(int num, int power) {
        int result = 0;
        for (int i = 0; i < power; i++) {
            result += num * num;
        }
        return result;
    }
}
