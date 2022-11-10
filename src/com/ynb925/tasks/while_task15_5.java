package com.ynb925.tasks;

import java.util.Scanner;

/**
 * Задание 15.5  Напишите класс, который принимает с клавиатуры числа,
 * пока не будет введено значение 999.
 * Класс должен подсчитать, сколько значений было введено с клавиатуры
 * (не считая значения 999), и вывести эту информацию на экран.
 */
public class while_task15_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число :");
        int inNum = scanner.nextInt();
        int count = 0;

        do {
            count++;
        } while ((inNum = scanner.nextInt()) != 999);
        System.out.println(count);
    }
}
