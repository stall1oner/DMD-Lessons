package com.ynb925.tasks;

import java.util.Scanner;

/**
 * Задание 11.16 Напишите класс, который читает с консоли 1 число и выводит на экран в строку
 * все положительные не четные числа (в возрастающем порядке) меньше за это число . Числа должны
 * отделяться друг от друга знаком «пробел». Перед началом вывода на экран (в отдельной строке)
 * следует вывести слово Старт, а после окончания вывода чисел (тоже в отдельной строке)-слово Финиш.
 */
public class while_task11_16 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        int value1 = scanner.nextInt();
        int value2 = 0;

        System.out.println("Старт");

        while (value2 <= value1) {
            if (value2 % 3 == 1)
                System.out.println(value2);
            value2++;
        }
        System.out.println("Финиш");
    }
}