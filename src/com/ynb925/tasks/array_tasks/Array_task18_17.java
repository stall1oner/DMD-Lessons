package com.ynb925.tasks.array_tasks;

import javax.imageio.metadata.IIOMetadataFormatImpl;
import java.util.Random;
import java.util.Scanner;

/**
 * Задание 18.17 Напишите класс, который заполняет случайными трехзначными числами массив,
 * размер которого при инициализации вводится с клавиатуры. После заполнения класс должен
 * вывести на экран значения массива следующим образом: в каждой строке выводится значения
 * из двух ячеек, симметрично расположенных по отношению к середине массива.
 * В случае если массив имеет нечетный размер, центральную ячейку следует выводить в отдельной строке.
 * Например, массив 345, 455, 677, 175, 985 выводится на экран следующим образом: 345 и 985 455и175 677
 * {15, 8, 19, 35, 90} -> 15 и 90, 8 и 35, 19
 * <p>
 * wrt size of arr
 * 5
 * ------- data input -------------
 * index: 0| 486
 * index: 1| 378
 * index: 2| 180
 * index: 3| 709
 * index: 4| 699
 * ------- data input -------------
 * <p>
 * 486 699
 * 378 709
 * centr index |2:  180
 */
public class Array_task18_17 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random rnd = new Random();

        System.out.println("Введите число для размера массива");
        int[] newArr = new int[scanner.nextInt()];

        int halfArr = newArr.length / 2;

        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = rnd.nextInt(100, 1000);
            System.out.println("index: " + " " + newArr[i]);
        }
        System.out.println("______________________");

        for (int i = 0, j = newArr.length - 1; i <halfArr; i++, j--) {
            System.out.print(newArr[i] + "  " + newArr[j]);
            System.out.println();
        }
        if (newArr.length % 2 != 0) {
            System.out.println();
            System.out.println(newArr[halfArr]);
        }
    }
}

   /*     for (int v = 0, j = newArr.length-1; v < halfArr; v++,j--) {                            //  prt   1st part arr
            System.out.print("value 1: " + newArr[v] + " " + "value 2: " + newArr[j]);        }

        System.out.println();

        for (int n = halfArr,j = newArr.length-1; n < newArr.length; n++, j--) {             // prt  2nd part arr
            System.out.print("value 1: " + newArr[n] + " " + "value 2: " + newArr[j]);        }

*/


/*


 */

/*
 for (int i = 0 , j=0  ;         i < arr.lee ;        i++ , j--  ) {

        }
 */
