package com.ynb925.tasks;

import java.util.Scanner;

/**
 * Задание 9.5* (тут вродь как без составного ифа, но задачка со звездочеойю. На пошевелить мозгами)
 * На каждом этаже многоэтажного дома расположены три квартиры; счет квартир идет слева направо.
 * Например, на первом этаже квартира No 1 расположена слева, квартира No 2  -в центре, квартира No 3 - справа,
 * и так далее. Напишите класс, который принимает с клавиатуры номер квартиры и выводит на экран следующую информацию:
 * на каком этаже она расположе на, и какое место (слева, справа или в центре) она занимает на этом этаже.
 */
public class task9_5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число : ");
        int n = scanner.nextInt();

        int z = ((n + (3 - 1)) / 3); // формула для вычета этажа (округление до большего и деление на 3)

        n = n % 3;
        if (n == 1) System.out.println
                ("Квартира слева на " + z + " этаже");
        if (n == 2) System.out.println
                ("Квартира по центру на " + z + " этаже");
        if (n == 0) System.out.println
                ("Квартира справа на " + z + " этаже");


    }

}


