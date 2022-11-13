package com.dmddev.lessons;

public class ForExample {
    public static void main(String[] args) {

        for (int i = 10; i > 0; i--) {
            System.out.println(i);
            if (i == 5) {
//                break;
            }
        }
    }

    private static void forExample() {
        for (int value = 10; value > 0; value--) {
            System.out.println(value);
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
}
