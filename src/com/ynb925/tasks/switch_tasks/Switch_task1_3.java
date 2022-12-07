package com.ynb925.tasks.switch_tasks;

import java.util.Scanner;
/**
 * Задача 1.3  * Напишите программу, которая принимает поступления с консоли. Программа должна пройти тестирование
 * для следующих возрастных диапазонов: от 0 до 10, от 11 до 20, от 21 до 30, от 31 года и старше.
 * Отобразите сообщение в окне возраст +» это между 21 и 30 годами»  или «Вам более 30 лет»
 * Vnimanee! проверка на более чем 30 должна проводиться не явно. то есть вырадение вроде:
 * возраст >= 31, возраст > 30 не должны расти.
 */
public class Switch_task1_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите возраст : ");
        int n = scanner.nextInt();

        switch (n){
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                System.out.println( n + " " + "это между 0 и 10");
                break;
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                System.out.println( n + " " + "это между 11 и 20");
                break;
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
                System.out.println( n + " " + "это между 21 и 30");
                break;

            default:
                System.out.println("Вам более 30 лет");
        }

    }
}
