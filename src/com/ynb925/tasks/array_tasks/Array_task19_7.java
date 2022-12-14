package com.ynb925.tasks.array_tasks;

import java.util.Random;

/**
 * Задание 19.7 Напишите метод, который получает в качестве параметра массив и заполняет его
 * случайными числами в диапазоне О ... 99. (масив должен быть на 100 елемментов).
 * <p>
 * ПС: тут кстати впервые встречаэться работа с ссылочными типами. Можно обговорить.
 * Гуглить придется, ну если не долго, то непонятно.
 */
public class Array_task19_7 {
    public static void main(String[] args) {
        int[] array = new int[100];
        arrayRandomizer(array);
    }

    private static void arrayRandomizer(int[] array) {
        Random rnd = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(0, 100);
            System.out.println("index " + i + ":" + " " + array[i] + " ");
        }
        System.out.println();
    }
}


