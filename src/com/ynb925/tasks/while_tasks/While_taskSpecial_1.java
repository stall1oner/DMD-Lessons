package com.ynb925.tasks.while_tasks;

import java.util.Objects;
import java.util.Scanner;

public class While_taskSpecial_1 {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        boolean isExit = false;
        int counter = 0;

        while (!isExit)
        {
            String s = console.nextLine();
            if (Objects.equals(s, "exit")){
            counter++;
            }
            if (counter == 5){
                isExit = true;
                System.out.println("Вы ввели exit 5 раз");
            }

        }

    }
}
