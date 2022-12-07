package com.ynb925.tasks.array_tasks;

import java.util.Scanner;

/**
 * Задание 18.13 Напишите класс, который заполняет массив рядом чисел
 * - 5, 10, 99, -125, 898, 124, 999, 0, 1, 125, 983, 123, -1000, 89, 69, 996, 44, -1, 102, -87.
 * Размер массива при инициализации вводится с клавиатуры. После заполнения класс должен вывести
 * на экран значения массива в одной строке, начиная с «начала» массива (с первой ячейки).
 */
public class Array_task18_13 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter arr size: ");
        int[] newArr = new int[scanner.nextInt()];

        for (int i : newArr) {
            i = scanner.nextInt();
            System.out.print("  |" + i + " ");

        }
    }

}


/*


 */
/*      Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число размера массива");
        int size = scanner.nextInt();

        int[] array = {-5, 10, 99, -125, 898, 124, 999, 0, 1, 125, 983, 123, -1000, 89, 69, 996, 44, -1, 102, -87};

        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }

    }

}
       int a0 = -5;
        int a1 = 10;
        int a2 = 99;
        int a3 = -125;
        int a4 = -898;
        int a5 = -124;
        int a6 = 999;
        int a7 = 0;
        int a8 = 1;
        int a9 = 125;
        int a10= 983;
        int a11= 123;
        int a12= -1000;
        int a13= 89;
        int a14= 69;
        int a15= 996;
        int a16= 44;
        int a17= -1;
        int a18= 102;
        int a19= -86;


        int[] arrayMain = new int[scanner.nextInt() ];
        arrayMain [0] = a0;
        arrayMain [1] = a1;
        arrayMain [2] = a2;
        arrayMain [3] = a3;
        arrayMain [4] = a4;
        arrayMain [5] = a5;
        arrayMain [6] = a6;
        arrayMain [7] = a7;
        arrayMain [8] = a8;
        arrayMain [9] = a9;
        arrayMain [10] = a10;
        arrayMain [11] = a11;
        arrayMain [12] = a12;
        arrayMain [13] = a13;
        arrayMain [14] = a14;
        arrayMain [15] = a15;
        arrayMain [16] = a16;
        arrayMain [17] = a17;
        arrayMain [18] = a18;
        arrayMain [19] = a19;

        for (int i = 0; i < arrayMain.length; i++) {
            System.out.print(arrayMain[i] + " ");*/


