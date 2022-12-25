package com.ynb925.tasks.array_tasks;

/**
 * Задание 19.47 Полезная задача, но наверное подгорит)
 * Напишите метод, который принимает в качестве параметров два массива целых чисел одинаковой длины
 * и проверяет, являются ли массивы идентичными.
 * пример
 * 1 2 3 5 7    и    1 2 3 5 7  -> true
 * 1 2 3 4 7    и    1 2 3 5 7  -> false
 */
public class Array_task19_47 {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 2, 3, 4, 5, 6};
        int[] arr2 = new int[]{1, 2, 3, 4, 5, 6};

        System.out.println(arrEqual(arr1, arr2));
    }

    private static boolean arrEqual(int[] array1, int[] array2) {

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }

    }
/*
        int[] firstArray = {1, 2, 3, 4, 7};
        int[] secondArray = {1, 2, 3, 5, 7};
        isEqualArray(firstArray, secondArray);
        System.out.println(isEqualArrayBoolean(firstArray, secondArray));
    }


    public static void isEqualArray(int[] firstArray, int[] secondArray) {
        int result = 0;
        for (int i = 0, j = 0; i < firstArray.length; i++, j++) {
            if (firstArray[i] == secondArray[j]) {
                result++;
            } else result -= 1000;
        }
        if (result > 0) System.out.println(true);
        if (result < 0) System.out.println(false);
    }

    public static boolean isEqualArrayBoolean(int[] firstArray, int[] secondArray) {
        for (int i = 0, j = 0; i < firstArray.length; i++, j++) {
            if (firstArray[i] != secondArray[j]) {
                return false;
            }
        }
        return true;

    }
}
*/

