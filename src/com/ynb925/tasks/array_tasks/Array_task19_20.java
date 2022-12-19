package com.ynb925.tasks.array_tasks;

/**
 * Задание 19.20 Напишите метод, который получает в качестве параметра
 * массив и проверяет есть ли там повторяющиеся элемент ВЩЩБЩЕ.
 * Если есть - возвращает TRUE
 * <p>
 * <p>
 * 1 2 3 6 8 4 6 1 515 893
 */
public class Array_task19_20 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 6, 8, 4, 6, 1, 515, 893};
        int[] testArray = {1,2,3,4,5,6,7,8,9};
        arrayChecker(array);
    }

    public static void arrayChecker (int[] array){
        int[] arrayCompare = new int [array.length];
        int checkSum = 0;

        for (int i = 0; i < array.length ; i++) {
            for (int j = i+1; j <arrayCompare.length ; j++) {
                if (array[i] == array[j]){
                    checkSum -=1000;
                }
            }
        }
        if (checkSum < 0) System.out.println(true);
        if (checkSum == 0) System.out.println(false);
    }
}
