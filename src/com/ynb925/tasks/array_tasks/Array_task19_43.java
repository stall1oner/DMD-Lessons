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
            if (tempArray[i] != tempArray[i-1]){
                System.out.print(tempArray[i] + " ");

            }

        }
    }
}

/*
 int[] arr1 = new int[]{1, 3, 5, 7};
    int[] arr2 = new int[]{2, 5, 7, 9, 11};

    aarsSorting(arr1, arr2);
}

public static void aarsSorting(int[] array1, int[] array2) {
        int[] arraynew = new int[array1.length + array2.length];

        for (int i = 0, j = 0; i < array1.length; i++, j++) {
        arraynew[i] = array1[j];
        for (int c = arraynew.length / 2, m = 0; m < array2.length; c++, m++) {
        arraynew[c] = array2[m];
        }
        }
        Arrays.sort(arraynew);
        System.out.print(arraynew[0] + " ");
        for (int i = 1; i < arraynew.length; i++) {
        if (arraynew[i] != arraynew[i - 1]) {
        System.out.print(arraynew[i] + " ");
        }
        }
        }
        }

        */


