package com.ynb925.tasks.array_tasks;

/**
 * Задание 19.24 Напишите метод, который принимает в качестве параметра массив целых чисел и проверяет,
 * являются ли все элементы массива положительными числами.
 */
public class Array_task19_24 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        isThereAnyNegatives(array);
    }

    public static void isThereAnyNegatives(int[] array) {
    int answer = 0;
        for (int i = 0; i <array.length; i++) {
            if (array[i] < 0){
                answer++;
            }
        }
        if (answer > 0) System.out.println("false");
        if (answer == 0) System.out.println("true");
    }


}
