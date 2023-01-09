package com.dmddev.lessons.com.dmdev;

public class dv_task3 {
    public static void main(String[] args) {
        double money = 24;
        double year = 1627;
        double percent = 0.05;

        for (double i = year; i < 2022; i++) {
            money = money + (money * percent);
            System.out.println(i + " " + money);
        }


    }
}
