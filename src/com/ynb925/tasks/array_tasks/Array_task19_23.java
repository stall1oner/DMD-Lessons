package com.ynb925.tasks.array_tasks;
/**
 * Задание 19.23 Напишите метод, который принимает два параметра:
 * массив целых чисел М и еще одно целое число Х.
 * Метод проверяет, находится ли число Х в массиве.
 */
public class Array_task19_23 {
    public static void main(String[] args) {
    int [] array = {0,1,2,3,4,5,6,7,8,9};
    int value = 5;
    arrayIsValueInHere(array,value);
    }


    public static void arrayIsValueInHere(int[] array,int value){
        int answer = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value){
                answer++;
            }
        }
       if (answer > 0){
           System.out.println("Value is " + answer + " times in array.");
       }else System.out.println("There is no similar value in array");
    }
}
