package com.ynb925.tasks.for_tasks;

import java.util.Scanner;

/**
 * Задание 11.27 звучит интерестно, по желанию
 * Напишите класс, который принимает с клавиатуры целое положительное число,
 * а затем выводит на экран все целые положительные двузначные числа, сумма цифр которых равна введенному с клавиатуры значению.
 */

public class for_task11_27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число : ");
        int sumOfDigits = scanner.nextInt();
        int a = 0;
        int b = 0;
        int c = 0;


        for (int i = 1; i < 100; i++) {
            a = i / 10;
            b = i % 10;
            c = a + b;
            if (c != sumOfDigits){
                continue;
            }
            System.out.println(i);
        }

    }
}




