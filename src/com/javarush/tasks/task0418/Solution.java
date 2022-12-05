package com.javarush.tasks.task0418;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Минимум двух чисел
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String value1 = reader.readLine();
        String value2 = reader.readLine();
        int value3 = Integer.parseInt(value1);
        int value4 = Integer.parseInt(value2);


        if (value3 > value4){
        System.out.println(value4);

        }else if (value4 > value3){
            System.out.println(value3);

        }else System.out.println(value4);



    }
}