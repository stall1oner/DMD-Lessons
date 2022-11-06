package com.ynb925.tasks;

import java.util.Scanner;

/**
 * Задание 7.11 Напишите класс, который принимает с клавиатуры два различных числа.
 * Класс должен вывести на экран эти числа в порядке возрастания -в одной строке,
 * а в другой -их же, но в порядке убывания.
 */
public class task7_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a > b || b > a) {
            System.out.println(b + " " + a);
            System.out.println(a + " " + b);

        }

    }

}







