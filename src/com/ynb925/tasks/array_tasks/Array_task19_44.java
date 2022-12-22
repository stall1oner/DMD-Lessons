package com.ynb925.tasks.array_tasks;

/**
 * Задание 19.44 Напишите метод, который принимает в качестве параметра
 * массив целых чисел и сдвигает все элементы массива,
 * кроме первого, на одну позицию влево. Значение, находившееся
 * в начальной ячейке массива, переходит в последнюю ячейку (левый сдвиг).
 * <p>
 * пример 1 2 3 4 5 -> 2 3 4 5 1
 */
public class Array_task19_44 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        arrayLeftSwing(array);
    }

    public static void arrayLeftSwing(int[] array) {
        int[] finalArray = new int[array.length];

        for (int i = 0; i < finalArray.length - 1; i++) {
            finalArray[i] = array[i + 1];
        }
        finalArray[finalArray.length - 1] = array[0];

        for (int i = 0; i < finalArray.length; i++) {
            System.out.print(finalArray[i] + " ");
        }

    }
}
