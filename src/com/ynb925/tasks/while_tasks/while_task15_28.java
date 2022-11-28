package com.ynb925.tasks.while_tasks;

import java.util.Scanner;

/**
 * Задание 15.28 типичная задача для вайла))))
 * Напишите класс, который принимает с клавиатуры целое число и подсчитывает число цифр в нем (количество цифр в числе).
 * Результат подсчета должен быть выведен на экран. Например, для чис ла 534 на экран будет выведено 3 цифры.
 */
public class while_task15_28 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter nums 2x symbols: ");
        int inputNum = scanner.nextInt();

        int division = 1;
        int res = 0;
        int countNums = 0;

        while (inputNum / division != 0) {             // (inpunt  != 0)

            res = (inputNum / division) % 10;    // res  = inputNum % 10;
            division = division * 10;                  // inputNum /= 10;

            countNums++;
        }
        System.out.println(countNums);
    }
}
