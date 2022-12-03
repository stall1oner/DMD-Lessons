package com.ynb925.tasks.array_tasks;

import java.util.Random;
import java.util.Scanner;

/**
 * Задание 18.14 Напишите класс, который заполняет случайными трехзначными числами массив,
 * размер которого при инициализации вводится с клавиатуры. После заполнения класс должен
 * вывести на экран значения массива следующим образом:
 * • в первой строке -первую половину массива;
 * • во второй строке -вторую половину массива.
 * В случае если массив имеет нечетный размер, центральную ячейку следует выводить в первой строке.
 */

public class array_task18_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Введите число для размера массива");
        int[] arrayNew = new int[scanner.nextInt()];

        int arrayHalf = arrayNew.length / 2;


        if (arrayNew.length % 2 != 0) {  //  нечетный размер
            arrayHalf++;              // определяет в какую строку выводить (1\2) декремент выведет во вторую.
        }

        for (int i = 0; i < arrayNew.length; i++) {      // enter randoms nums
            arrayNew[i] = random.nextInt(100, 1000);

        }

        for (int v = 0; v < arrayHalf; v++) {                            //  prt   1st part arr
            System.out.print(" |" + v + ":" + arrayNew[v]);
        }

        System.out.println();

        for (int n = arrayHalf; n < arrayNew.length; n++) {             // prt  2nd part arr
            System.out.print(" |" + n + ":" + arrayNew[n]);
        }

    }
}



/* int arraySize = scanner.nextInt();


        if (arraySize % 2 == 0){
            int[][] arrayNum = new int[2][];

            for (int i = 0; i < arrayNum.length; i++) {
                int[] ints = arrayNum[i];
                for (int j = 0; j < ints.length; j++) {
                ints[j] = random.nextInt(100, 1000);
                }
            }

        };*/

/* int[] arrayNew = new int[scanner.nextInt()];
        for (int i = 0; i < arrayNew.length; i++) {
            arrayNew[i] = random.nextInt(100,1000);
            System.out.print(arrayNew[i] + " ");
        }*/
/*for (int i = 0; i < arrayNew.length; i++) {
            arrayNew[i] = random.nextInt(100, 1000);
            int arrayNewSize = arrayNew.length;

            int[] a = new int[(arrayNewSize + 1) / 2];
            int[] b = new int[arrayNewSize - a.length];


            for (int i1 = 0; i1 < arrayNewSize; i1++)
            {
                if (i1 < a.length) {
                    a[i1] = arrayNew[i1];
                }
                else {
                    b[i1 - a.length] = arrayNew[i1];
                }
            }
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[i] + " ");

            }

            for (int j = 0; j < b.length; j++) {
                System.out.println(b[i] + " ");
            }*/