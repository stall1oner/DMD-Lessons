package com.ynb925.tasks.while_tasks;

import java.util.Scanner;

//
//
//        /
//        * 1!=1
//        * 2!=2
//        * 3!=6
//        * 4!=24
//        * 5!=120
//        * 6!=720
//        * 7!=5040
//        * fact(m) = n * n-1 * n-2 * n-3....
//        * fact(5) = 1 * 2 * 3 * 4 * 5
//        * 001         3    2
//        * int res = fact * i; = 6
//        * Задание 15.35 УУУУХХХХПОДГОРИТ))))
//        * Напишите класс, который принимает с клавиатуры целое положительное число
//        * и строит из него число с обратным порядком цифр. Новое значение следует вывести на экран
//
public class while_task15_35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        int inNum = scanner.nextInt();
        int reverseNum = 0;

        while (inNum != 0) {
            int lastDigit = inNum % 10;
            reverseNum = reverseNum * 10 + lastDigit;
            inNum = inNum / 10;
        }
        System.out.println(reverseNum);


    }
}
