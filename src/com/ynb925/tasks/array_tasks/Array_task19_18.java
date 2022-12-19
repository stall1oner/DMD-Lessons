package com.ynb925.tasks.array_tasks;

/**
 * Задание 19.18 Напишите метод, который получает в качестве параметра массив
 * и проверяет в масиве неубывающую последовательность (каждый элемент не меньше предыдущего).
 * Пример:
 * 1 2 5 9 9 12 99 - метод возвращает TRUE
 * 10 12 22 5 84 - метод возвращает FALSE
 */
public class Array_task19_18 {
    public static void main(String[] args) {
        int[] arrayTrue = {1, 2, 5, 9, 9, 12, 99};
        int[] arrayFalse = {10, 12, 22, 5, 84};
        arrayCheck(arrayFalse);
    }

    public static void arrayCheck(int[] arrayTrue) {
    int tempValue = 0;
    int answer = 0;

        for (int i = 0; i < arrayTrue.length; i++) {
            if (arrayTrue[i] >= tempValue){
                answer += 1;
            } else if (arrayTrue[i] < tempValue) {
                answer -= 10000;
            }
            tempValue = arrayTrue[i];
        }
        if (answer >= 0) {
            System.out.println(true);
        }else if (answer <= 0){
            System.out.println(false);
        }
        }


    }




