package com.ynb925.tasks.for_tasks;

import java.util.Scanner;

/**
 * Задание 11.23 Напишите класс, который вначале принимает с клавиатуры целое положительное число (в переменную х),
 * которое будет количеством членов в арифметической прогрессии. Первый член прогрессии равен 7, а разница между
 * соседними членами прогрессии равна 4. Затем класс выводит на экран в строку серию из х членов этой прогрессии.
 * Числа должны отделяться друг от друга знаком «пробел». Перед началом и после окончания вывода серии чисел
 * на экран вывода следует вывести текстовые сообщения (по выбору).
 */
public class for_task11_23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число : ");
        int x = scanner.nextInt(); //сколько шагов будет
        int valueProgress = 7; // стартовое знчение

        System.out.println("Старт");

        for (int i = x; i > 0; i--) {
            valueProgress +=4;
            System.out.print(valueProgress + " ");
        }
        System.out.println("Финиш");

        }

    }

