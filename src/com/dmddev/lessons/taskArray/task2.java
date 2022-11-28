package com.dmddev.lessons.taskArray;

public class task2 {
    public static void main(String[] args) {
    int[] values = new int[100];
    fillArray(values);
    printArrayForEach(values);

    }

    public static void fillArray(int[] values) {
        int currentIndex = 0;
        for (int currentValue = 1; currentIndex < values.length; currentValue++) {
            if (currentValue % 13 == 0 || currentValue % 17 == 0) {
                values[currentIndex] = currentValue;
                currentIndex++;
            }

        }
    }
    public static void printArrayForEach(int[] values) {
        for (int value : values) {
            System.out.print( value + " ");
        }
        System.out.println();
    }
}