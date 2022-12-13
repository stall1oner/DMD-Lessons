package com.javarush.task.pro.task05.task0511;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Создаем двумерный массив
*/

public class Solution {
    public static int[][] multiArray;

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        System.out.println("Введите размер основного массива");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int inputSize = Integer.parseInt(reader.readLine());
        multiArray = new int[inputSize][];


        for (int i = 0; i < inputSize; i++) {
            System.out.println("Задайте размер вторичного массива " + (i) + "/" + inputSize);
            multiArray[i] = new int[Integer.parseInt(reader.readLine())];

        }


        for (int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray[i].length; j++) {
                System.out.print(multiArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
