package com.ynb925.tasks.for_tasks;

import java.util.Scanner;

/**
 * Задание 12.2  Напишите класс, который принимает с клавиатуры 15 целых чисел и
 * выводит на экран информацию о том, сколько из них были четными и сколько нечетными.
 * ПС если хочешь не вводить вручную, есть лайфхаки,
 */

public class for_task12_2 {   // спроосить про лайфхак
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число :");
        int count = 0;
        int equal = 0;
        int odd = 0;

        for (int i = count; i < 15; i++) {
            int inNum = scanner.nextInt();
            if (inNum % 2 == 0) {
                equal++;
            } else odd++;
        }
        System.out.println("Чётных " + equal);
        System.out.println("Нечётных " + odd);
    }
}
