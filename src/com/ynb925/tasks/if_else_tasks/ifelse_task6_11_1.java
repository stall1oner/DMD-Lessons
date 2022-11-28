package com.ynb925.tasks.if_else_tasks;

import java.util.Scanner;

/**
 * Задание 6.11.1 (моя задача)
 * Напишите класс, который принимает с клавиатуры одно целое число.
 * Если оно делиться на 2 выведи "Делиться на 2".
 * Если оно делиться на 3 выведи "Делиться на 3".
 * Если оно делиться на 4 выведи "Делиться на 4".
 * Если число делиться на несколько этих чисел, выведи соответствующие надписи.
 */
public class ifelse_task6_11_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число : ");
        int n = scanner.nextInt();


        if (n % 2 == 0) {
            System.out.println("Делится на 2");
        }
        if (n % 3 == 0) {
            System.out.println("Делится на 3");
        }
        if (n % 4 == 0) {
            System.out.println("Делится на 4");
        }
        if (n % 2 == 0 && n % 3 == 0 && n % 4 == 0) {
            System.out.println("делиться на несколько этих чисел");
        }
    }
}


