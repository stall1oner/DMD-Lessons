package com.ynb925.tasks.while_tasks;

import java.util.Scanner;

/**
 * Задание 15.7 Напишите класс, который должен принять с клавиатуры значение 123 и вывести на экран
 * сообщение Код принят. Класс будет снова и снова принимать с клавиатуры значения до тех пор, пока
 * не будет введено значение 123. На каждое вводимое с клавиатуры значение, отличное от 123, класс
 * должен выводить сообщение Код неверный, повторите ввод.
 */

public class While_task15_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 123 :");
        int inNum = scanner.nextInt();

        if (inNum == 123) {
            System.out.println("Код приянт");

            while ((inNum = scanner.nextInt()) != 123) {
                System.out.println("Код неверный повторите ввод");
            }
        }

        if (inNum == 123) {
            System.out.println("Код приянт");
        }
    }
}


// System.out.println("Код принят");
// System.out.println("Код неверный, повторите ввод.");