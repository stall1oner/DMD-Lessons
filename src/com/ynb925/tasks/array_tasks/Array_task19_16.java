package com.ynb925.tasks.array_tasks;

import java.util.Random;
/**
 * Задание 19.16 Любопытненько)
 * Напишите метод, который получает в качестве параметра массив и заполняет
 * его положительными случайными двузначными числами так, чтобы значение
 * первого элемента было равно значению последнего,
 * значение второго элемента
 * было равно значению предпоследнего и так далее
 */
public class Array_task19_16 {
    public static void main(String[] args) {
        int[] array = new int[10];
        arrayRandSymmetry(array);
    }

    public static void arrayRandSymmetry(int[] array) {
        Random rnd = new Random();

        int halfArr = array.length / 2;

        for (int i = 0; i < halfArr; i++) {
            array[i] = rnd.nextInt(10, 100);

        }

        for (int i = 0, j = array.length-1; i < halfArr; i++, j--) {
            array[j] = array[i];
        }


        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }


    }

}