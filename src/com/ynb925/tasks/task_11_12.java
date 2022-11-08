package com.ynb925.tasks;

import java.util.Scanner;

public class task_11_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число 1:");
        int value1 = scanner.nextInt();
        System.out.println("Введите число 2:");

        int value2 = scanner.nextInt();

        System.out.println("Старт");
        while (value1 < value2 ) {
            System.out.println(value1);
            value1++;
        }
        while (value2 < value1 ) {
            System.out.println(value2);
            value2++;
        }
        if (value1 == value2){
            System.out.println(value1);
        }
        System.out.println("Финиш");
    }
}
