package com.javarush.tasks.lessons;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class test2 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] intArray = new int[10];
        String[] stringsArray = new String[10];

        for (int i = 0; i < 10; i++) {
            stringsArray[i] = reader.readLine();
            intArray[i] = stringsArray[i].length();
        }

        for (int i : intArray) {
            System.out.println(i);
        }
    }
}
