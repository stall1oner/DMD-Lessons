package com.dmddev.lessons.com.dmdev;

public class Lesson7_array {
    public static void main(String[] args) {
        char[] values = new char[10];
        System.out.println(values[1]);
        values[4] = 'e';
        values[5] = 'r';

        for (int i = 0; i < values.length; i++) {
            System.out.println(i + " :" + values[i]);
        }
    }

    private static void test() {
        int value = 10;
        int[] values = {1, 5, 6, 8, 9};
        System.out.println(values[2]);

        values[3] = 18;
        System.out.println(values[3]);
    }
}
