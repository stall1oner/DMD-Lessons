package com.javarush.task.jdk13.task04.task0428;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Положительные числа

Введи с клавиатуры три целых числа. Выведи на экран количество положительных чисел среди этих трех.

Примеры:
а) при вводе чисел:
-4
6
6
получим вывод:
2

б) при вводе чисел:
-6
-6
-3
получим вывод:
0

в) при вводе чисел:
0
1
2
получим вывод:
2
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String value0 = reader.readLine();
        String value1 = reader.readLine();
        String value2 = reader.readLine();

        int a = Integer.parseInt(value0);
        int b = Integer.parseInt(value1);
        int c = Integer.parseInt(value2);

        int result = 0;


        if (a > 0) {
            result++;
        }
        if (b > 0) {
            result++;
        }
        if (c > 0) {
            result++;
        }
        System.out.println(result);
    }
}
