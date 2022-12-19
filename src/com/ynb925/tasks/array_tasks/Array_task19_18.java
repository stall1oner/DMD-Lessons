package com.ynb925.tasks.array_tasks;

/**
 * Задание 19.18 Напишите метод, который получает в качестве параметра массив
 * и и проверяет в масиве неубывающую последовательность (каждый элемент не меньше предыдущего).
 * Пример:
 * 1 2 5 9 9 12 99 - метод возвращает TRUE
 * 10 12 22 5 84 - метод возвращает FALSE
 */
public class Array_task19_18 {
    public static void main(String[] args) {
        int[] array = {1, 2, 5, 9, 9, 12, 99};
        arrayChecker(array);
    }

    public static void arrayChecker(int[] array) {
        int temp = 0;
        int answer = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] >= temp) {
                answer += 1;
            } else if (array[i] < temp) {
                answer -= 1000;
            }
            temp = array[i];
        }
        if (answer>0){
            System.out.println(true);
        }else if(answer< 0) System.out.println(false);
    }


}
