package com.company;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces1(3.1111110, 3.1100));
    }
    // recursive method
    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
        if(num1 * num2 < 0) {
            return false;
        }
        return compareDecimal(Math.abs(num1 * 1000), Math.abs(num2 * 1000), Math.abs(num1), Math.abs(num2));
    }

    public static boolean compareDecimal(double num1, double num2, double number1, double number2) {
        System.out.println("1");
        if((Math.round(num1) == Math.round(number1)) && (Math.round(num2) == Math.round(number2))) {
            return true;
        }
        double tens1 = Math.floor(num1 % 10);
        double tens2 = Math.floor(num2 % 10);

        if(tens1 != tens2) {
            return false;
        } else {
            num1 = num1 / 10;
            num2 = num2 / 10;
            return compareDecimal(num1, num2, number1, number2);
        }
    }

    //other method

    public static boolean areEqualByThreeDecimalPlaces1(double num1, double num2) {
        if(num1 * num2 < 0) {
            return false;
        }
        num1 = Math.abs(num1 * 1000);
        num2 = Math.abs(num2 * 1000);
        boolean output = true;

        while (num1 > 1 && num2 > 1) {
            double tens1 = Math.floor(num1 % 10);
            double tens2 = Math.floor(num2 % 10);

            if(tens1 != tens2) {
                output = false;
                break;
            } else {
                num1 = num1 / 10;
                num2 = num2 / 10;
            }
        }
        return output;
    }


}
