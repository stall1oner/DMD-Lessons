package com.ynb925.tasks.array_tasks;
/**
 * Задание 19.48 Напишите метод, который принимает в качестве параметров два массива целых чисел и проверяет,
 * содержатся ли все значения первого массива во втором.
 * <p>
 * {1 4 3 2} && {5 8 1 6 4 2 9 3}       -> true
 *
 * {1 2 3}        {5 1 8 3 99}              ->false
 */
public class Array_task19_48 {
    public static void main(String[] args) {
        int[]firstArray = {1,4,3,2};
        int[]secondArray = {5,8,1,6,3,2,9,3};
        similarValuesInArray(firstArray,secondArray);

    }

    public static void similarValuesInArray(int[]firstArray,int[]secondArray){

    }
}
