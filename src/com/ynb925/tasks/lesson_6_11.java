package com.ynb925.tasks;

import java.util.Scanner;
/**
 * Задание 6.11  Напишите класс, который принимает с клавиатуры два целых числа и,
 * если оба имеют одинаковый знак, на экран выводится сообщение Один
 * и тот же знак, а если разный, то на экран выводится сообщение Разные знаки.
 * Если же хотя бы одно из чисел равно О, выводится сообщение Некорректно.
 */
public class lesson_6_11 {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введите число 1 : ");
        int a = scanner1.nextInt();
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Введите число 2 : ");
        int b = scanner2.nextInt();
        if (a == 0 || b == 0) {
            System.out.println("Некорректно");
        } else if (a == b) {
            System.out.println("Один и тот же знак");
        }else {
            System.out.println("Разные знаки");
        }

    }

        }
