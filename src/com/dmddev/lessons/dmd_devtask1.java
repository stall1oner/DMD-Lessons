package com.dmddev.lessons;

public class dmd_devtask1 {
    public static void main(String[] args) {
        forExample();
        whileExample();

    }

    private static void forExample() {
        int value = 5;
        int result = 1;

        for (int i = 1; i <= value; i++) {
            result = result * i;
        }
        System.out.println(result);
    }


    public static  void whileExample (){
        int value = 5;
        int result = 1;

        while (value != 0){
            result = result * value;
            value--;
        }
        System.out.println(result);
    }
}
