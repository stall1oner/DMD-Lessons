package com.ynb925.tasks.switch_tasks;

import java.util.Scanner;
/**
 * Задание 9.14 Определим «текстовую форму оценки» следующим образом: 2», 3  -«удовлетворительно»,
 * 4  -«хорошо», 5  -«ОТЛИЧНО». Напишите класс, который принимает с клавиатуры целое число и, если оно соответствует оценке,
 * выводит на экран соответствующую «текстовую форму оценки». В случае если число не является оценкой, следует вывести на
 * экран соответствующее текстовое сообщение.
 */

public class switch_task9_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число : ");
        int n = scanner.nextInt();

        switch (n){
            case 1, 2 -> System.out.println("Неудовлетворительно");
            case 3 -> System.out.println("Удовлетворительно");
            case 4 -> System.out.println("Хорошо");
            case 5  -> System.out.println("Отлично");
            default -> System.out.println("Введена неправильная цифра");
        }
    }
}
