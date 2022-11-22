package com.ynb925.tasks;

import java.util.Scanner;

/**
 * 12_1
 * Напишите класс, который принимает с клавиатуры 10  целых чисел и выводит на экран информацию о том,
 * сколько из них были положительными.
 */
public class for_task12_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число :");
        int counter = 0;
        int pos = 0;
        int neg = 0;

        for (int i = counter; i < 10; i++) {
            int inNum = scanner.nextInt();
            if (inNum > 0) {
                pos++;
            } else neg++;


        }
        System.out.println("Положительных " + pos);
        System.out.println("Отрицательных " + neg);

    }
}

