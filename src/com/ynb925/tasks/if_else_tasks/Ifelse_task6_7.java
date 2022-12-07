package com.ynb925.tasks.if_else_tasks;

import java.util.Scanner;

/**
 * Задание 6.7
 * Напишите класс, который принимает с клавиатуры целое положительное число и,
 * если оно как минимум трехзначное и положительное, уменьшает его на 1.
 */
public class Ifelse_task6_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число : ");
        int n = scanner.nextInt();
        if (n >= 100) {
            n--;
            System.out.println(n);

        } else {
            System.out.println(n);

        }
    }
}
