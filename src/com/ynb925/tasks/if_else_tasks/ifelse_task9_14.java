package com.ynb925.tasks.if_else_tasks;

import java.util.Scanner;

/**
 * Задание 9.14 Определим «текстовую форму оценки» следующим образом: 1 или 2 -«неудовлетворительно», 3  -«удовлетворительно»,
 * 4  -«хорошо», 5  -«ОТЛИЧНО». Напишите класс, который принимает с клавиатуры целое число и, если оно соответствует оценке,
 * выводит на экран соответствующую «текстовую форму оценки». В случае если число не является оценкой, следует вывести на
 * экран соответствующее текстовое сообщение.
 */

public class ifelse_task9_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число : ");
        int n = scanner.nextInt();

        if (n == 1 || n == 2) {
            System.out.println("Неудовлетворительно");
        } else if (n == 3) {
            System.out.println("Удовлетворительно");
        } else if (n == 4) {
            System.out.println("Хорошо");
        } else if (n == 5) {
            System.out.println("Отлично");
        }
    }

}
