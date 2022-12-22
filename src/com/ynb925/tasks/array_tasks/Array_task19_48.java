package com.ynb925.tasks.array_tasks;
/**
 * Задание 19.48 Напишите метод, который принимает в качестве параметров два массива целых чисел и проверяет,
 * содержатся ли все значения первого массива во втором.
 * {1 4 3 2}     {5 8 1 6 4 2 9 3}       -> true
 * {1 2 3}        {5 1 8 3 99}           ->false
 */
public class Array_task19_48 {
    public static void main(String[] args) {
        int[] firstArray = {1, 4, 3, 2};
        int[] secondArray = {5, 8, 1, 6, 4, 2, 9, 3};

        int[] thirdArray = {5, 1, 8, 3, 99};
        int[] fourthArray = {1, 2, 3};
        System.out.println(isValuesSimilarInArray(firstArray, secondArray));
        System.out.println(isValuesSimilarInArray(thirdArray, fourthArray));
    }

    public static boolean isValuesSimilarInArray(int[] firstArray, int[] secondArray) {
        int result = 0;

        if (firstArray.length < secondArray.length) {
            for (int i : secondArray) {
                for (int j : firstArray) {
                    if (i == j) {
                        result++;
                    }
                }
            }
            return result == firstArray.length;

        } else if (firstArray.length > secondArray.length) {
            for (int i : firstArray) {
                for (int j : secondArray) {
                    if (i == j) {
                        result++;
                    }
                }
            }
            return result == secondArray.length;
        }
        return false;
    }
}

