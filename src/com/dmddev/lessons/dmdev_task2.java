package com.dmddev.lessons;

import java.util.Scanner;

public class dmdev_task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число : ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int result = whatBigger(a, b);
        System.out.println(result);
    }

    public static int whatBigger(int firstValue, int secondValue) {
        if (firstValue > secondValue) {
            return firstValue;
        } else {
            return secondValue;
        }
    }
}