package com.dmddev.lessons;
import java.util.Random;




public class tst {
    public static void main(String[] args) {
        System.out.println();
        int min = 100;
        int max = 200;
        int diff = max - min;
        Random random = new Random();


        for (int j = 0; j < 100; j++) {

            int i = random.nextInt(diff + 1);
            i += min;
            System.out.println(i);
        }

    }
}
