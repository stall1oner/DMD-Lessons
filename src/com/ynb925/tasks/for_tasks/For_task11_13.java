package com.ynb925.tasks.for_tasks;

import java.util.Scanner;

/**
 * Задание 11.13 Напишите класс, который читает с консоли 2 числа и выводит на экран в строку все числа
 * (в УБЫВАЮЩЕМ порядке) с этого диапазона. Числа должны отделяться друг от друга знаком «пробел».
 * Перед началом вывода на экран (в отдельной строке) следует вывести слово Старт, а после окончания
 * вывода чисел (тоже в отдельной строке)-слово Финиш.
 */

public class For_task11_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число 1 : ");
        int value1 = scanner.nextInt();
        System.out.println("Введите число 2 : ");
        int value2 = scanner.nextInt();


        System.out.println("Старт");

        for (int i = value2; i >= value1; i--) {
            System.out.print(i + " ");

        }

        for (int i = value1; i >= value2; i--) {
            System.out.print(i + " ");

        }

        if (value1 == value2) {
            System.out.println("Одинаковые числа");

        }
        System.out.println("Финиш");


    }
}
