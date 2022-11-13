package com.dmddev.lessons;

public class dmdev_task6 {
    public static void main(String[] args) {
        double sourceSum = 24;
        double result = sum(sourceSum);
        System.out.println(result);
    }

    public static double sum(double sourceSum) {
        double result = sourceSum;

        for (int year = 1626 + 1; year <= 2022; year++) {
        double percent = result * 0.05;
        result += percent;
            System.out.println(year + " : " + result);
        }
        return result;
    }
}

