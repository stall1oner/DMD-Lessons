package com.ynb925.tasks.array_tasks;

/**
 * Задание 19.34 Напишите метод, который принимает в качестве параметра массив целых чисел
 * и возвращает число ячеек массива, содержащих значения большие среднего арифметического массива.
 */
public class Array_task19_34 {
    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        algebraicMiddle(array);
    }

    public static void algebraicMiddle(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        int mid = sum / array.length;
        int answer = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > mid) answer++;
        }
        System.out.println(answer);
    }
}


/*
    int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(arrayBigindex(array));
                }

public static int arrayBigindex(int[] array) {

        int Sum = 0;
        int middleSum;

        for (int j : array) {
        Sum += j;
        }
        middleSum = Sum / array.length;

        int countCell = 0;
        for (int j : array) {
        if (j > middleSum) {
        countCell++;
        }
        }
        return countCell;
        }
        }

        */
