package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(12247));
    }
    // Coding Exercise: Number in Word
    public static void printNumberInWord(int number) {
        switch(number) {
            case 0:
                System.out.println("ZERO");
                break;
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            case 9:
                System.out.println("NINE");
                break;
            default:
                System.out.println("OTHER");
        }
    }

    //Coding Exercise: Number Of Days In Month
    public static boolean isLeapYear(int year) {
        if(year < 1 || year > 9999) {
            return false;
        } else {
            return (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0));
        }
    }
    public static int getDaysInMonth(int month, int year) {
        if(year < 1 || year > 9999) {
            return -1;
        }

        switch(month) {
            case 1:case 3:case 5:case 7:case 8:case 10:case 12:
                return 31;

            case 2:
                if(isLeapYear(year)) {
                    return 29;
                }
                return 28;

            case 4:case 6:case 9:case 11:
                return 30;

            default:
                return -1;
        }


    }
    //Coding Exercise: Sum Odd
    public static boolean isOdd(int number) {
        return ((number > 0) && (number % 2 == 1));
    }

    public static int sumOdd(int start, int end) {
        if(start > end || start <= 0 || end <= 0) {
            return -1;
        }
        int sum = 0;
        for(int i = start; i<= end; i++) {
            if(isOdd(i)) {
                sum = sum + i;
            }
        }
        return sum;
    }

    //Coding Exercise: Number Palindrome
    public static boolean isPalindrome(int number) {
        int comparisonL = Math.abs(number);
        int comparisonR = 0;

        int places = 1;
        while((comparisonL / places) >= 10) {
            places = places * 10;
        }
        while(comparisonL >= 1) {
            comparisonR = comparisonR + ((comparisonL % 10) * places);
            comparisonL = comparisonL / 10;
            places = places / 10;
        }
        if(Math.abs(number) == comparisonR) {
            return true;
        }
        return false;
    }

    //Coding Exercise: First and Last Digit Sum
    public static int sumFirstAndLastDigit(int number) {
        if(number < 0) {
            return -1;
        }
        int last = number % 10;
        int first = 0;
        while(number >= 1) {
            first = number % 10;
            number = number / 10;
        }
        return first + last;
    }






}