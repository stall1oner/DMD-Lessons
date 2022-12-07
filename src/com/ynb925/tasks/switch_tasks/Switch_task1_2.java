package com.ynb925.tasks.switch_tasks;

import java.util.Scanner;

/**
 * Задача 1.2  В текущей задаче необходимо, чтобы пользователь задавал наименование месяца, а программа выдавала номер месяца.
 * Выводимый на экран текст должен быть примерно таким: "Номер месяца наименование месяца - номер месяца".
 * Если наименование месяца введено не верно, должно быть выведено на экран соответствующее сообщение.
 */
public class Switch_task1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Задайте наименование месяца: ");
        String str = sc.nextLine();
        switch (str) {
            case "Январь":
                System.out.println("01 Январь - 01");
                break;
            case "Февраль":
                System.out.println("02 Февраль - 02");
                break;
            case "Март":
                System.out.println("03 Март - 03");
                break;
            case "Апрель":
                System.out.println("04 Апрель - 04");
                break;
            case "Май":
                System.out.println("05 Май - 05");
                break;
            case "Июнь":
                System.out.println("06 Июнь - 06");
                break;
            case "Июль":
                System.out.println("07 Июль - 07");
                break;
            case "Август":
                System.out.println("08 Август - 08");
                break;
            case "Сентябрь":
                System.out.println("09 Сентябрь - 09");
                break;
            case "Октябрь":
                System.out.println("10 Октябрь - 10");
                break;
            case "Ноябрь":
                System.out.println("11 Ноябрь - 11");
                break;
            case "Декабрь":
                System.out.println("12 Декабрь - 12");
                break;
            case "январь":
                System.out.println("01 январь - 01");
                break;
            case "февраль":
                System.out.println("02 февраль - 02");
                break;
            case "март":
                System.out.println("03 март - 03");
                break;
            case "апрель":
                System.out.println("04 апрель - 04");
                break;
            case "май":
                System.out.println("05 май - 05");
                break;
            case "июнь":
                System.out.println("06 июнь - 06");
                break;
            case "июль":
                System.out.println("07 июль - 07");
                break;
            case "август":
                System.out.println("08 август - 08");
                break;
            case "сентябрь":
                System.out.println("09 сентябрь - 09");
                break;
            case "октябрь":
                System.out.println("10 октябрь - 10");
                break;
            case "ноябрь":
                System.out.println("11 ноябрь - 11");
                break;
            case "декабрь":
                System.out.println("12 декабрь - 12");
                break;
            default:
                System.out.println("Наименование месяца введено не верно");


        }


    }
}
