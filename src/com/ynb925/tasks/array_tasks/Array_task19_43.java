package com.ynb925.tasks.array_tasks;

import java.util.Arrays;

/**
 * Задание 19.43 Подгорит!
 * Напишите метод, который получает в качестве параметров два упорядоченных по возрастанию массива и возвращает
 * упорядоченный по возрастанию массив, содержащий значения обоих массивов-параметров, но без повторов значений.
 * <p>
 * Например, если массивы-параметры содержат    1, 3, 5, 7     and    2, 5, 7, 9, 11,
 * то выходной массив содержит значения             1, 2, 3, 5, 7, 9, 11.
 */
public class Array_task19_43 {
    public static void main(String[] args) {
        int[] firstArray = {1, 3, 5, 7};
        int[] secondArray = {2, 5, 7, 9, 11,};
        arrayMerger(firstArray, secondArray);
    }

    public static void arrayMerger(int[] firstArray, int[] secondArray) {
        int[] tempArray = new int[firstArray.length+secondArray.length];

        for (int i = 0; i < firstArray.length; i++) {
        tempArray[i] = firstArray[i];
        }

        for (int i = secondArray.length; i > 0; i--) {
            tempArray[firstArray.length+i-1] = secondArray[i-1];
        }

        Arrays.sort(tempArray);

        System.out.print(tempArray[0] + " ");
        for (int i = 1; i < tempArray.length; i++) {
            if (tempArray[i] > tempArray[i-1]){
                System.out.print(tempArray[i] + " ");

            }

        }
    }
}
