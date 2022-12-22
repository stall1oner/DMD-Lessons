package com.ynb925.tasks.array_tasks;

/**
 * Задание 19.37 Напишите метод, который принимает в качестве параметра массив целых чисел и
 * возвращает порядковый номер ячейки, содержащей максимальное значение.
 * Если в массиве есть несколько ячеек, содержащих максимальное значение,
 * метод вернет порядковый номер первой из них.
 */
public class Array_task19_37 {
    public static void main(String[] args) {
        int[] array = {0, 1, 2, 4, 4, 5, 6, 7, 8, 9};
        arrayMaxIndex(array);
    }

    public static void arrayMaxIndex(int[] array) {
        int maxValue = 0;
        int maxIndex = 0;

        for (int i = 0; i < array.length; i++) {
            if (maxValue < array[i]) {
                maxValue = array[i];
                maxIndex = i+1 ;
            }
        }
        System.out.println(maxIndex);
    }
}
