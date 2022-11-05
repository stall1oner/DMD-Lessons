package com.ynb925.tasks;

import java.util.Scanner;

/**
 * Задание 6.6 Напишите класс, который принимает с клавиатуры целое число и выводит на экран
 * одно из следующих сообщений: Положительное, или Отрицательное, или Ноль, -в зависимости от значения числа.
 */

public class lesson_6_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число : ");
        int n = scanner.nextInt();
        if (n > 0) {
            System.out.println("Положительное");

        }
        else if (n < 0) {
            System.out.println("Отрицательное");

        } else
            System.out.println("Ноль");

    }
}
