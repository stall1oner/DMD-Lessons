package com.ynb925.tasks;

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
        int valueSC = scanner.nextInt();
        int sumValue = 0;
        int tempValue = 0;

        if (valueSC != tempValue){
            do{
                    tempValue = 0;
                    valueSC = scanner.nextInt();
                    tempValue = tempValue + valueSC;
                    sumValue = sumValue + tempValue;

            }while (valueSC != tempValue);
        }

        }

    }
