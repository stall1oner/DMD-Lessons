package com.ynb925.tasks.while_tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

///15.00 Написать программу факториал через вайл.
public class While_task15_00 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter num");

        int input = Integer.parseInt(reader.readLine());
        int factorial = 1;

        while( input > 0){
            factorial *= input;
            input--;
        }
        System.out.println(factorial);

    }
}
