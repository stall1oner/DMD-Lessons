package com.javarush.tasks.lessons;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test1 {
    public class Solution {
        public static void main(String[] args) throws IOException {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            int[] countResidents = new int[15];
            for (int i = 0; i < 15; i++) {
                countResidents[i] = Integer.parseInt(reader.readLine());
            }

            int even = 0;
            int odd = 0;

            for (int i = 0; i < 15; i++) {
                if (i % 2 == 0) {
                    even += countResidents[i];
                } else {
                    odd += countResidents[i];
                }
            }

            if (even > odd) {
                System.out.println("В домах с четными номерами проживает больше жителей.");
            } else if (odd > even) {
                System.out.println("В домах с нечетными номерами проживает больше жителей.");
            }
        }
    }











}
 /*   public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] arrayHouse = new int[15];

        for (int i : arrayHouse) {
            arrayHouse[i] = Integer.parseInt(reader.readLine());
        }

        int sumEqualHouses = 0;
        int sumOddHouses = 0;

        for (int i = 0; i < arrayHouse.length; i+=2) {
            sumEqualHouses = sumEqualHouses + arrayHouse[i];
        }
        for (int i = 1; i < arrayHouse.length; i+=2) {
            sumOddHouses = sumOddHouses + arrayHouse[i];
        }

        if (sumEqualHouses > sumOddHouses){
        System.out.println("В домах с четными номерами проживает больше жителей.");
        } else if (sumOddHouses > sumEqualHouses) {
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
        }
    }
}
*/
