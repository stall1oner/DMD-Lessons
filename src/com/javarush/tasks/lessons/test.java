package com.javarush.tasks.lessons;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class test {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] mainArray = new int[20];

        int[] firstArray = new int[10];
        int[] secondArray = new int[10];

        for (int i = 0; i < mainArray.length; i++) {
            mainArray[i] = Integer.parseInt(reader.readLine());
        }

        for (int i = 0; i < 10 ; i++) {
            firstArray[i] = mainArray[i];
        }

        for (int i = 10, j = 0; i < 20; i++, j++) {
            secondArray[j] = mainArray[i];
        }
        for (int i = 0; i < secondArray.length; i++) {
            System.out.println(secondArray[i]);
        }

    }
}

