package com.ynb925.tasks.if_else_tasks;

import java.util.Scanner;

/**
 * if else
 * Задание 8.15 Напишите класс, который принимает с клавиатуры двузначное положительное число и проверяет,
 * какая из его двух цифр является большей.
 * В соответствии с результатом проверки надо вывести на экран соответствующее текстовое сообщение.
 * Не следует выводить на экран ни какого сообщения, если число составлено из одинаковых цифр.
 */
public class ifelse_task8_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число : ");
        int n = scanner.nextInt();

        int a = n / 10;
        int b = n % 10;

/*        System.out.println(a);
        System.out.println(b);*/

        if (a > b) {
            System.out.println(" 1я цифра больше ");
        } else {
            System.out.println(" 2я цифра больше ");
            System.out.println(b + "" + a);
        }

    }
}