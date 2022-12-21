package com.ynb925.tasks.array_tasks;

/**
 * Задание 19.30 Напишите метод, который принимает в качестве параметра
 * массив и проверяет, являются ли его элементы упорядоченными по возрастанию.
 */
public class Array_task19_30 {
    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        isArrayInAscendingOrder(array);

    }

    public static void isArrayInAscendingOrder(int[] array) {
        int answer = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) answer++;
            }
        }
        if (answer == 0) System.out.println("It's ok, ascending mode enabled");
        if (answer > 0) System.out.println("Ascending mode isn't enabled");

    }
}


/*
    public static boolean arrayOrder(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                return false;
            }
        }
        return true;
    }
}
*/

