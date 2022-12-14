package com.ynb925.tasks.array_tasks;
/**
 * Задание 19.13 Напишите метод, который получает в качестве параметра
 * массив и число которым нужно заполнить этот массив.
 */
public class Array_task19_13 {
    public static void main(String[] args) {
    int [] array = new int[10];
    int value = 50;
    arrayInjector(array,value);

    }

    private static void arrayInjector(int[] array, int value){
        for (int i = 0; i < array.length; i++) {
            array[i] = value;
            System.out.println(array[i]+ " ");
        }

    }

}
