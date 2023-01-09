package com.dmddev.lessons.com.dmdev;

public class RecursionExample {
    public static void main(String[] args) {
        int factorial = factorial(5);
        System.out.println(factorial);
    }
    public static int factorial(int value){
        if (value == 1) {
            return 1;
        }
        return value * factorial(value - 1);
    }
}
