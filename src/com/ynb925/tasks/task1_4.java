package com.ynb925.tasks;

import java.util.Scanner;

public class task1_4 {
    /**
     * Задача 1.4 от себя.   Меня в университете учили так 1 2 3 а дальше много. я был умным и умел считать до 10.
     * И так - досчитай до 10 от введенного числа. если число больше 10, выводишь надпись "много".
     * если меньше 1 выводишь надпись "мало 1 2 3 4 5 6 7 8 9 10 много".
     * Например вводишь число 4, на выводе получаешь -> 4 5 6 7 8 9 10 много.
     * И напоминаю - часто свитч. Приятного горения пердака)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число : ");
        int a = scanner.nextInt();

        if (a >= 0) {
            switch (a) {
                case 0:
                    System.out.println("Мало");
                case 1:
                    System.out.println(1);
                case 2:
                    System.out.println(2);
                case 3:
                    System.out.println(3);
                case 4:
                    System.out.println(4);
                case 5:
                    System.out.println(5);
                case 6:
                    System.out.println(6);
                case 7:
                    System.out.println(7);
                case 8:
                    System.out.println(8);
                case 9:
                    System.out.println(9);
                case 10:
                    System.out.println(10);
                    System.out.println("Много");
                    break;
            }
        } else if (a > 10) {
            System.out.println("Много");
        }else{
            System.out.println("Мало");
        }
    }
}
