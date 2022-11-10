package com.ynb925.tasks;

import java.util.Scanner;

/**
 * Задание 15.8 Напишите класс, который принимает с клавиатуры значения, пока их сумма остается меньше 150.
 * По окончании ввода следует вывести на экран информацию о количестве введенных значений и их сумме.
 */

public class while_task15_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        int sum = 0;
        int count = 0;

        while (sum != 150) {
            int n = scanner.nextInt();
            sum = sum + n;                       // алгоритм подсмотрел тут https://www.scaler.com/topics/add-two-numbers-in-java/
            count++;
        }
        System.out.println("Количество введенных значений" + " " + count);
        System.out.println("Сумма" + " " + sum);


    }
}
