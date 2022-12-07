package com.ynb925.tasks.for_tasks;

import java.util.Scanner;

/**
 * Задание 11.15 Напишите класс, который читает с консоли 1 число и выводит на экран в строку
 * все положительные четные числа (в возрастающем порядке) меньше за это число . Числа должны
 * отделяться друг от друга знаком «пробел». Перед началом вывода на экран (в отдельной строке)
 * следует вывести слово Старт, а после окончания вывода чисел (тоже в отдельной строке)-слово Финиш.
 */

public class For_task11_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int value1 = scanner.nextInt();

        System.out.println("Старт");

        for (int i = 0; i < value1; i++) {
            if (i % 2 != 0) {
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Финиш");
    }
}
