package com.ynb925.tasks.while_tasks;

import java.util.Scanner;

/**
 * Напишите класс, который принимает с клавиатуры число для переменной Х, а затем дополнительную серию чисел,
 * каждое из которых используется для уменьшения значения переменной Х. Ввод чисел должен производиться до тех пор,
 * пока значение переменной Х остается положительным.
 */

public class While_task15_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" enter Num: ");
        int scanNum = scanner.nextInt();
        int xNum = scanNum;

        while (xNum > 0) {
            xNum = xNum - scanner.nextInt();
            System.out.println(xNum);
        }
        System.out.println(" finish ");
    }
}

 /*       Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        int x = scanner.nextInt();
        int value = 0;


        while (x != 0) {
            value = scanner.nextInt();
            x = x - value;
            x += 0;
        }
        System.out.println(x);
    }*/


/*
        */


