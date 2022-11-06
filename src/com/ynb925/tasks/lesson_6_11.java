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
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число : ");
        int n = scanner.nextInt();
        int a = 11;
        int b = n / a;
        if (b == 0) {
            System.out.println("Один");
        } else if (b != 0) {
            System.out.println("Разные знаки");
        }

    }

        }

