package com.javarush.tasks.task0425;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Координатные четверти
Введи с клавиатуры два целых числа, которые будут координатами точки, не лежащей на осях OX и OY.
Выведи на экран номер координатной четверти, в которой находится данная точка.

Подсказка:
Принадлежность точки с координатами (a,b) к одной из четвертей определяется следующим образом:

для первой четверти - a>0 и b>0;
для второй четверти - a<0 и b>0;
для третьей четверти - a<0 и b<0;
для четвертой четверти - a>0 и b<0.


Пример для чисел 4 6:
1
Пример для чисел -6 -6:
3

Требования:
•	Программа должна считывать числа c клавиатуры.
•	Программа должна использовать команду System.out.println() или System.out.print().
•	Если точка находится в первой координатной четверти, вывести "1".
•	Если точка находится во второй координатной четверти, вывести "2".
•	Если точка находится в третей координатной четверти, вывести "3".
•	Если точка находится в четвёртой координатной четверти, вывести "4".
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String value0 = reader.readLine();
        String value1 = reader.readLine();

        int a = Integer.parseInt(value0);
        int b = Integer.parseInt(value1);

        if (a > 0 && b > 0){
            System.out.println("1");
        } else if (a < 0 && b > 0){
            System.out.println("2");
        }else if (a < 0 && b < 0) {
            System.out.println("3");
        }else if (a > 0 && b < 0) {
            System.out.println("4");
        }
    }
}
