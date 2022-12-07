package com.ynb925.tasks.for_tasks;

import java.util.Scanner;

/**
 * Задание 12.5   Напишите класс, который генерирует 15 целых чисел в интервале от -25 до 25, печатает их,
 * а затем выводит на экран информацию о том, сколько из них были:
 * • положительными;
 * • четными;
 * • однозначными.
 */
public class For_task12_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число :");
        int count = 0;
        int positiveNum = 0;
        int equalNum = 0;
        int unoNum = 0;

        for (int i = count; i < 15; i++) {
            int inNum = scanner.nextInt();
            if (inNum < 10 && inNum > -10) {
                unoNum++;
            }
            if (inNum % 2 == 0) {
                equalNum++;
            }
            if (inNum > 0) {
                positiveNum++;
            }
        }
        System.out.println("Положительных " + " " + positiveNum);
        System.out.println("Чётных " + " " + equalNum);
        System.out.println("Однозначных " + " " + unoNum);
    }
}
