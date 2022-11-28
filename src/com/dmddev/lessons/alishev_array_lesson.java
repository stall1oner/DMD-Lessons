package com.dmddev.lessons;

public class alishev_array_lesson {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        numbers[0] = 10;
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);


        String[] strings = new String[3];
        strings[0] = " Привет";
        strings[1] = " Пока";
        strings[2] = " Java";
        System.out.println(strings[0]);
        System.out.println(strings[2]);
        System.out.println();

        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }

        System.out.println();
//      Тип данных|| назв. перем внутри цикла|| массив через который мы проходим
        for (String string : strings) {
            System.out.println(string);
        }


        int[] numbers1 = {1, 2, 3};
        int sum = 0;
        for (int x : numbers1) {
            sum += x;
            System.out.println(sum);
        }
        System.out.println(sum);



        int value = 0;
        String s;
    }
}

