package com.ynb925.tasks;

import java.util.Scanner;
/**
 * Задание 6.11.1 (моя задача)
 * Напишите класс, который принимает с клавиатуры одно целое число.
 * Если оно делиться на 2 выведи "Делиться на 2".
 * Если оно делиться на 3 выведи "Делиться на 3".
 * Если оно делиться на 4 выведи "Делиться на 4".
 * Если число делиться на несколько этих чисел, выведи соответствующие надписи.
 */
public class task6_11_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число : ");
        int n = scanner.nextInt();
        int a = (n % 2);
        int b = (n % 3);
        int c = (n % 4);
        if (a == 0 ){
            System.out.println("Делится на 2");
        }
        if (b == 0){
            System.out.println("Делится на 3");
        }
        if (c == 0){
            System.out.println("Делится на 4");
        }
        }


    }

