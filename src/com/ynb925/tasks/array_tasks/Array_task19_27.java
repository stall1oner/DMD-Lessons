package com.ynb925.tasks.array_tasks;
/**
 * Задание 19.27 Напишите метод, который принимает в качестве параметра массив целых чисел М и целое число К
 * (номер одной из ячеек массива). Метод возвращает сумму значений, расположенных в ячейках массива
 * от начальной -до ячейки номер К(включительно).
 */
public class Array_task19_27 {
    public static void main(String[] args) {
        int [] array = {0,1,2,3,4,5,6,7,8,9};
        int indexValue = 4;
        sumFromIndexes(array,indexValue);
    }

    public static void sumFromIndexes(int [] array,int indexValue){
        int sum = 0;

        for (int i = 0; i < array[indexValue+1]; i++) {
            sum += array[i];
        }
        System.out.println(sum);
    }
}
