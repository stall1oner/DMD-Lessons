package com.ynb925.tasks.array_tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Задание 19.22 Напишите метод, который принимает два параметра: массив целых чисел М и еще одно целое число Х.
 * Метод возвращает количество ячеек массива М, содержащих значение Х (число появлений Х в М).
 * input {1,2,3,4} , int x=23   ||   output prt : 4 cell and num =23
 */
public class Array_task19_22 {
    public static void main(String[] args) throws IOException {
        arrayChecker();
    }

    public static void arrayChecker() throws IOException {
        System.out.println("Enter array size:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int [] array = new int[Integer.parseInt(reader.readLine())];

        System.out.println("Enter check value");
        int value = Integer.parseInt(reader.readLine());
        int answer = 0;

        System.out.println("Enter Arr value " + array.length + " times");

        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        for (int i = 0; i <array.length ; i++) {
            if (array[i] == value) answer++;
        }

        System.out.println("There were "+ answer + " same numbers in array");
    }
}
