package com.ynb925.tasks.array_tasks;

/**
 * Задание 19.51 Напишите метод, который принимает в качестве параметров
 * два массива целых чисел одинаковой длины. Метод возвращает массив,
 * содержащий значения массивов-параметров, записанные по правилу
 * «ПО очереди из параллельных ячеею>.
 * Например, для массивов
 * <p>
 * 1, 2, 3, 4  ||   6, 7, 8, 9
 * метод возвращает массив
 * 1, 6, 2, 7, 3, 8, 4, 9.
 */
public class Array_task19_51 {
    public static void main(String[] args) {
        int[] firstArray = {1, 2, 3, 4};
        int[] secondArray = {6, 7, 8, 9};
        arrayParallelSummarizer(firstArray, secondArray);
    }

    public static void arrayParallelSummarizer(int[] firstArray, int[] secondArray) {
        int[] finalArray = new int[firstArray.length + secondArray.length];

        for (int i = 0,j=0; i < firstArray.length; i++,j+=2) {
            finalArray[j] = firstArray[i];
        }
        for (int i = 0,j=1; i < secondArray.length; i++,j+=2) {
            finalArray[j] = secondArray[i];
        }

        for (int i = 0; i < finalArray.length; i++) {
            System.out.print(finalArray[i] + " ");
        }
    }
}
