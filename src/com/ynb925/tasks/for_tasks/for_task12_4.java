package com.ynb925.tasks.for_tasks;

import java.util.Scanner;

/**
 * Задание 12.4 Напишите класс, который принимает с клавиатуры 17 целых чисел и
 * выводит на экран информацию о том, сколько из них были больше, чем предыдущее число.
 * enter 0 2 1 4 => 2 ()
 */

public class for_task12_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число :");
        int count = 0;
        int tempNum = 0;

        for (int i = count; i < 17; i++) {
            int inNum = scanner.nextInt();
            if (inNum > tempNum) {
                count++;
            }
            tempNum = inNum;
        }
        System.out.println(count-1);
    }
}
