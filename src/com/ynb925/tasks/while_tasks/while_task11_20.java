package com.ynb925.tasks.while_tasks;

/**
 * Задание 11.20 Напишите класс, который выводит на экран в строку положительные трехзначные числа,
 * делящиеся на 80 с остатком 45 (в возрастающем порядке). Числа должны отделяться друг от друга знаком «пробел».
 * Перед началом и после окончания вывода серии чисел на экран вывода следует вывести текстовые сообщения (по выбору).
 */

public class while_task11_20 {
    public static void main(String[] args) {
        int value = 99;

        System.out.println("Старт");

        while (value <= 999 ) {
            if (value % 80 == 45)
                System.out.print(value + " ");
            value += 1;
        }
        System.out.println("Финиш");
    }
}
