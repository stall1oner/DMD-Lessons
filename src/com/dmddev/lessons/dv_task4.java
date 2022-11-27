package com.dmddev.lessons;

import java.util.Scanner;

public class dv_task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число :");
        int x = scanner.nextInt();
        boolean result = isSimple(x);
        System.out.println(result);
    }

    public static boolean isSimple(int x) {
        for (int i = 2; i < x; i++) {
            if (x % i == 0){
                return false;
            }
        }
        return true;
    }
}
