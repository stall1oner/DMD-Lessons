package com.javarush.task.pro.task05.task0516;

import java.util.Arrays;

/*
Заполняем массив
*/

public class Solution {

    public static int[] array = new int[21];
    public static int valueStart = 10;
    public static int valueEnd = 13;

    public static void main(String[] args) {
        //напишите тут ваш код

        int halfArr = array.length / 2;

        if (array.length % 2 == 0) {

        Arrays.fill(array,0,halfArr+0,valueStart);
        Arrays.fill(array,halfArr+0,array.length+0,valueEnd);
        }else {
            Arrays.fill(array,0,halfArr+1,valueStart);
            Arrays.fill(array,halfArr+1,array.length+0,valueEnd);
        }



        System.out.println(Arrays.toString(array));
    }
}
