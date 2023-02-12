package com.mine;


public class HexToDecimal {
    private static final String HEX = "0123456789abcdef";

    public static void main(String[] args) {
        int decimalNumber = 1256;
        System.out.println("Десятичное число " + decimalNumber + " равно шестнадцатеричному числу " + toHex(decimalNumber));
        String hexNumber = "4e8";
        System.out.println("Шестнадцатеричное число " + hexNumber + " равно десятичному числу " + toDecimal(hexNumber));
    }

    public static String toHex(int decimalNumber) {
        //напишите тут ваш код

        StringBuilder result = new StringBuilder();
        int tempValue = 0;
        while (decimalNumber != 0){
            tempValue = decimalNumber % 16;
            if (tempValue == 0) result.append("0");
            if (tempValue == 1) result.append("1");
            if (tempValue == 2) result.append("2");
            if (tempValue == 3) result.append("3");
            if (tempValue == 4) result.append("4");
            if (tempValue == 5) result.append("5");
            if (tempValue == 6) result.append("6");
            if (tempValue == 7) result.append("7");
            if (tempValue == 8) result.append("8");
            if (tempValue == 9) result.append("9");
            if (tempValue == 10) result.append("a");
            if (tempValue == 11) result.append("b");
            if (tempValue == 12) result.append("c");
            if (tempValue == 13) result.append("d");
            if (tempValue == 14)result.append("e");
            if (tempValue == 15) result.append("f");
            decimalNumber /=  16;
        }
        result.reverse();
        return result.toString();
    }

    public static int toDecimal(String hexNumber) {
        String digits = "0123456789ABCDEF";
        hexNumber = hexNumber.toUpperCase();
        int val = 0;
        for (int i = 0; i < hexNumber.length(); i++)
        {
            char c = hexNumber.charAt(i);
            int d = digits.indexOf(c);
            val = 16*val + d;
        }
        return val;
    }
}
