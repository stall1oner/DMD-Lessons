package com.dmddev.lessons.taskArray;

public class task1 {
    public static void main(String[] args) {
        int[] values = {1, 5, 7, 9, 11};
        printArray(values);
        printArrayForEach(values);
        printArrayReverse(values);

    }

    public static void printArrayReverse(int [] values){
        for (int i = values.length - 1; i >= 0 ; i--) {
            System.out.print(values[i] + " ");
        }
        System.out.println();
    }

    public static void printArray(int[] values) {
        for (int i = 0; i < values.length; i++) {
            System.out.print(values[i] + " ");
        }
        System.out.println();
    }

    public static void printArrayForEach(int[] values) {
        for (int value : values) {
            System.out.print( value + " ");
        }
        System.out.println();
    }
}
