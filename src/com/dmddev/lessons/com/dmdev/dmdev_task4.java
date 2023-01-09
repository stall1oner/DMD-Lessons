package com.dmddev.lessons.com.dmdev;

import java.util.Scanner;

public class dmdev_task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число : ");
        int input = scanner.nextInt();
        int result = factorial(input);
        System.out.println(result);

        int result2 = factorialWhile(input);
        System.out.println(result2);

    }

    public static int factorial(int input) {
        int result = 1;
        for (int i = 1; i <= input; i++) {
            result *= i;

        }
        return result;
    }

    public static int factorialWhile(int input) {
        int result = 1;
        int i = 1;

        while ( i < input) {
        i++;
        result = result * i;
        }
        return result;
    }
}
