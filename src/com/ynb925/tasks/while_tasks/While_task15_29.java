package com.ynb925.tasks.while_tasks;

import java.util.Scanner;
/**
 * Задание 15.29 Напишите класс, который принимает с клавиатуры целое число и подсчитывает сумму
 * его цифр. Результат подсчета должен быть выведен на экран.
 * Например, для чис ла 534 на экран будет выведено 12.
 */

public class While_task15_29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        int inputDigit = scanner.nextInt();

        int division = 1;
        int sum = 0;

        while (inputDigit / division != 0){
            sum = sum + inputDigit % 10;
            division = division * 10;
        }
        System.out.println(sum);


    }
}
