package com.dmddev.lessons;

public class switch_lessons {
    public static void main(String[] args) {
        //      byte, short,int, char, String, enum
        int a = 2;
        switch (a) {
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
        }
    }

}
