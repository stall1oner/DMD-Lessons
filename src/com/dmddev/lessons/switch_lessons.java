package com.dmddev.lessons;

import java.util.Scanner;

public class switch_lessons {
    public static void main(String[] args) {
        int a = 1;
                testSwitch(a);
    }

    public static void testSwitch(int a) {

        switch (a) {
            case 1 -> System.out.println("value == 1");
            case 2 -> System.out.println("value == 2");
            case 3 -> System.out.println("value == 3");
            case 4 -> System.out.println("value == 4");
            case 5 -> System.out.println("value == 5");
            case 6 -> System.out.println("value == 6");
            default -> System.out.println("Нет такого значения");

        }
       /* public static void testSwitch2() {
            Scanner scanner2 = new Scanner(System.in);
            System.out.println("Введите возраст : ");
            int switchValue2 = scanner2.nextInt();
            switch (switchValue2) {
                case 1:
                    System.out.println("value == 1");
                    break;
                case 2:
                    System.out.println("value == 2");
                    break;
                case 10:
                    System.out.println("value == 10");
                    break;
                case 28:
                    System.out.println("value == 28");
                    break;
                default:
                    System.out.println("Нет такого значения");
            }*/

    }
}

