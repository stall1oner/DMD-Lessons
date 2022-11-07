package com.dmddev.lessons;

import java.util.Scanner;

public class dmdev_lesson5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число : ");
        int a = scanner.nextInt();
        boolean result = isLeapYear(a);
        System.out.println(result);
    }

    public static boolean isLeapYear(int a) {
        return (a % 4 == 0 && a % 100 != 0 || a % 400 == 0);


    }
}