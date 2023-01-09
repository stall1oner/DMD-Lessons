package com.dmddev.lessons.com.dmdev;

import java.util.Scanner;

public class dmdev_task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число : ");
        int input = scanner.nextInt();

        int result = sumCounter(input);
        System.out.println("Сумма всех чисел до: " + result);

        int result2 = sumOfDigits(input);
        System.out.println(result2);

        int result3 = sumForDigits(input);
        System.out.println(result3);


    }

    public static int sumCounter(int input) {
        int result = input;

        for (int i = 1; i < input; i++) {
            result += i;

        }
        return result;
    }


    public static int sumOfDigits(int input) {
        int divide = 1;
        int sum = 0;

        while (input / divide != 0) {
            sum = sum + input % 10;
            divide = divide * 10;

        }
        return sum;

    }


    public static int sumForDigits(int input) {
        int currentValue = input;
        int result = 0;
        for (currentValue = input; currentValue != 0; currentValue /= 10) {
            result += currentValue % 10;
        }
        return  result;
    }
}