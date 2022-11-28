package com.ynb925.tasks.for_tasks;

import java.util.Scanner;

/**
 * Задание 11.14 Напишите класс, который читает с консоли 2 числа и выводит на экран в строку
 * все положительные числа (в возрастающем порядке) с этого диапазона. Числа должны отделяться
 * друг от друга знаком «пробел». Перед началом вывода на экран (в отдельной строке) следует
 * вывести слово Старт, а после окончания вывода чисел (тоже в отдельной строке)-слово Финиш.
 */

public class for_task11_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число 1 : ");
        int value1 = scanner.nextInt();
        System.out.println("Введите число 2 : ");
        int value2 = scanner.nextInt();


        System.out.println("Старт");

        for (int i = value1; i <= value2; i++) {
            if (i < 0) {
                continue;
            }
            System.out.print(i + " ");
        }

        for (int i = value2; i <= value1; i++) {
            if (i < 0) {
                continue;
            }
            System.out.print(i + " ");
        }

        System.out.println("Финиш");

    }
}
