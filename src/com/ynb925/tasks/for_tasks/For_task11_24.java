package com.ynb925.tasks.for_tasks;

import java.util.Scanner;

/**
 * Задание 11.24 Напишите класс, который вначале принимает с клавиатуры целое положительное число (в переменную х).
 * Затем класс выводит на экран в строку серию из 2х убывающих чисел, начиная с О; разница между соседними значениями в серии равна 8.
 * Числа должны отделяться друг от друга знаком «пробел». Перед началом и после окончания вывода серии чисел на экран
 * вывода следует вывести текстовые сообщения (по выбору).
 */
public class For_task11_24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число : ");
        int x = scanner.nextInt();

        System.out.println("Старт");

        for (int i = x; i >= -16; i--) {
            if (i < 0 && i % 8 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("Финиш");
    }
}
