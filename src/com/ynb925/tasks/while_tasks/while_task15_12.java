package com.ynb925.tasks.while_tasks;

import java.util.Scanner;

/**
 * Задание 15.12 Напишите класс, который принимает с клавиатуры целые числа, пока не будут введены
 * с клавиатуры друг за другом два одинаковых числа. Класс должен выводить на экран сумму серии
 * -за исключением по следнего введенного с клавиатуры значения.
 */
public class while_task15_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        int valueSC = 0;
        int sumValue = 0;
        int tempValue = 0;

        while ((valueSC = scanner.nextInt()) != tempValue) {
            tempValue = valueSC;
            sumValue = sumValue + valueSC;

        }
        System.out.println(sumValue);
    }
}

/*
    }
    Scanner scanner = new Scanner(System.in);
        System.out.println(" enter Num: ");
                int scanNum;
                int old = scanner.nextInt();
                int res = old;


                while ((scanNum = scanner.nextInt()) != old) {

                res = res + scanNum;
                old = scanNum;
                }
                System.out.println(res);
                }
                }
                */
