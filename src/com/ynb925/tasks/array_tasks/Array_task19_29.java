package com.ynb925.tasks.array_tasks;

/**
 * Задание 19.29 Напишите метод, который принимает в качестве параметра массив целых чисел М
 * и два целых числа К и Т (номера ячеек массива). Метод возвращает сумму значений,
 * расположенных в ячейках массива от ячейки номер К(включительно) -до ячейки номер Т(включительно).
 */
public class Array_task19_29 {
    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}; // 22
        int firstValue = 4;
        int secondValue = 7;
        sumOfArraysDifferentIndexes(array, firstValue, secondValue);
    }

    public static void sumOfArraysDifferentIndexes(int[] array, int firstValue, int secondValue) {
        int sum = 0;
        for (int i = firstValue; i < secondValue + 1; i++) {
            sum += array[i];
        }
        System.out.println(sum);
    }
}
