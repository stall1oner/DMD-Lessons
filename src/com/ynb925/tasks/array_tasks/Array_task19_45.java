package com.ynb925.tasks.array_tasks;

/**
 * Задание 19.45 Напишите метод, который принимает в качестве параметра массив целых чисел и
 * сдвигает все элементы массива, кроме последнего, на одну позицию вправо. Значение, находившееся
 * в последней ячейке массива, переходит в первую ячейку (правый сдвиг).
 * Пример 1 2 3 4 5 -> 5 1 2 3 4
 */
public class Array_task19_45 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        arrayRightSwing(array);
    }

    public static void arrayRightSwing(int[] array) {
        int[] finalArray = new int[array.length];

        for (int i = 0; i < finalArray.length - 1; i++) {
            finalArray[i + 1] = array[i];
        }
        finalArray[0] = array[array.length - 1];

        for (int i = 0; i < finalArray.length; i++) {
            System.out.print(finalArray[i] + " ");
        }
    }

}
