package com.dmddev.lessons;

import java.util.Scanner;

public class dmdev_task3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long value = scanner.nextInt();
        long result = in3(value);
        System.out.println(result);
    }

    public static long in3(long FirstValue) {
        return FirstValue * FirstValue * FirstValue;
    }
}
