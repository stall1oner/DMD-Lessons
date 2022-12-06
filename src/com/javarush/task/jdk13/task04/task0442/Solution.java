package com.javarush.task.jdk13.task04.task0442;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Суммирование
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        int sumInput = 0;

        while (true) {
            int input = Integer.parseInt(reader.readLine());
            sumInput = sumInput + input;

            if (input == -1) {
                break;
            }
        }
        System.out.println(sumInput);

    }
}
