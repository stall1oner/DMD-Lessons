package com.ynb925.tasks.while_tasks;

import java.util.Scanner;

/**
 * Задание 15.9 Напишите класс, который принимает с клавиатуры целое число,
 * а за тем выводит на экран последующие ему целые числа,
 * пока сумма этих чисел не превышает квадрата введенного числа.
 */

public class While_task15_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        int n = scanner.nextInt();
        int value = n;
        while (n < value * value) {
            n++;
            System.out.println(n);
        }
    }
}

// пи*дец тут подъебка, шо надо отдельно выводить ввод в отдельную переменную, комп загудел от вычеслений)))