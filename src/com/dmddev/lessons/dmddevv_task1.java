
package com.dmddev.lessons;

import java.util.Scanner;

public class dmddevv_task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число : ");
        int a = scanner.nextInt();
        if (a == 12 || a == 1 || a == 2) {
            System.out.println("Зима");
        }
        if (a == 3 || a == 4 || a == 5) {
            System.out.println("Весна");
        }
        if (a == 6 || a == 7 || a == 8) {
            System.out.println("Лето");
        }
        if (a == 9 || a == 10 || a == 11) {
            System.out.println("Осень");
        } else if (a <= 0 || a > 12) {
            System.out.println("Введён некорректный месяц");
        }
        if (a % 10 == 3) {
            System.out.println("Является");

        } else {
            System.out.println(" Не является");
        }
        if (a % 10 == 1 && a != 11 && a % 100 != 11) {
            System.out.println(a + " " + "Рубль");
        } else if ((a % 10 == 2 || a % 10 == 3 || a % 10 == 4)
                && !(a % 100 == 12 || a % 100 == 13 || a % 100 == 14)) {
            System.out.println(a + " " + "Рубля");
        } else {
            System.out.println(a + " " + "Рублей");
        }
        if (a % 4 == 0 && a % 100 != 0 || a % 400 == 0) {
            System.out.println("Високосный");
        } else {
            System.out.println("Невисокосный");
        }

    }
}