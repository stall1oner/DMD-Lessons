package com.ynb925.tasks.if_else_tasks;

import java.util.Scanner;

/**
 * Задание 7.11 Напишите класс, который принимает с клавиатуры два различных числа.
 * Класс должен вывести на экран эти числа в порядке возрастания -в одной строке,
 * а в другой -их же, но в порядке убывания.
 */
public class ifelse_task7_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a > b) {
            System.out.println(b + " " + a);
            System.out.println(a + " " + b);
        } else {
            System.out.println(a + " " + b);
            System.out.println(b + " " + a);
        }
    }
}

/*
                if (n1 > n2) {
                System.out.println(n2 + " " + n1);
                System.out.println(n1 + " " + n2);
                } else {
                System.out.println(n1 + " " + n2);
                System.out.println(n2 + " " + n1);
                }
                }
                }
*/






