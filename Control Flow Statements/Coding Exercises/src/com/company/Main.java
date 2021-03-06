package com.company;

public class Main {

    public static void main(String[] args) {
        printSquareStar(8);
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
    //Coding Exercise: Even Digit Sum
    public static int giveEvenDigitSum(int number) {
        if(number < 0) {
            return -1;
        }
        int sum = 0;
        while(number >= 1) {
            if((number % 10) % 2 == 0) {
                sum = sum + (number % 10);
            }
            number = number / 10;
        }
        return sum;
    }

    //Coding Exercise: Shared Digit
    public static boolean hasSharedDigit(int num1, int num2) {
        if(num1 < 10 || num1 > 99 || num2 < 10 || num2 > 99) {
            return false;
        }
        int num2Memory = num2;
        while(num1 >= 1) {
            num2 = num2Memory;
            while(num2 >= 1) {
                System.out.println(num1 % 10);
                System.out.println(num2 % 10);
                if(num1 % 10 == num2 % 10) {
                    return true;
                }
                num2 = num2 / 10;
            }
            num1 = num1 / 10;
        }
        return false;
    }

    //Coding Exercise: Last Digit Checker
    public static boolean hasSameLastDigit(int num1, int num2, int num3) {
        if(isValid(num1) && isValid(num2) && isValid(num3)) {
            return ((num1 % 10 == num2 % 10) || (num1 % 10 == num3 % 10) || (num2 % 10 == num3 % 10));
        }
        return false;
    }

    public static boolean isValid(int num) {
        if(num >= 10 && num <= 1000) {
            return true;
        }
        return false;
    }

    //Coding Exercise: Greatest Common Divisor
    public static int getGreatestCommonDivisor(int first, int second) {
        if(first < 10 || second < 10) {
            return -1;
        }
        int gcd = 0;
        if(first > second) {
            for(int i = 1; i <= second; i++) {
                if((first % i == 0) && (second % i == 0)) {
                    gcd = i;
                }
            }
        } else {
            for(int i = 1; i <= first; i++) {
                if((first % i == 0) && (second % i == 0)) {
                    gcd = i;
                }
            }
        }
        return gcd;
    }

    //Coding Exercise: All Factors
    public static void printFactors(int number) {
        if(number < 1) {
            System.out.println("Invalid Value");
        }
        for(int i = 1; i <= number; i++) {
            if(number % i == 0) {
                System.out.println(i);
            }
        }
    }

    //Coding Exercise: Perfect Number
    public static boolean isPerfectNumber(int number) {
        if(number < 1) {
            return false;
        }
        int factorSum = 0;
        for(int i = 1; i < number; i++) {
            if(number % i == 0) {
                factorSum = factorSum + i;
            }
        }
        if(factorSum == number) {
            return true;
        }
        System.out.println(factorSum);
        System.out.println(number);
        return false;
    }
    //Coding Exercise: Number To Words

    public static void numberToWords(int number) {
        if(number < 0) {
            System.out.println("Invalid Value");
        } else {
            if (number == 0) {
                System.out.println("Zero");
            }
            int length = getDigitCount(number);
            number = reverse(number);
            int lengthR = getDigitCount(number);

            while(number >= 1) {

                switch(number % 10) {
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                    default:
                        System.out.println("Error");
                }
                number = number / 10;
            }
            for(int i = length - lengthR; i > 0; i--) {
                System.out.println("Zero");
            }
        }
    }

    public static int reverse(int num) {
        boolean negative = false;
        if(num < 0) {
            negative = true;
        }
        num = Math.abs(num);
        int numR = 0;
        int places = getDigitCount(num) - 1;
        while(places >= 0) {
            numR = ((num % 10) * ((int) Math.pow(10, places))) + numR;
            places = places - 1;
            num = num / 10;
        }
        if(negative) {
            return numR * -1;
        } else {
            return numR;
        }

    }

    public static int getDigitCount(int number) {
        if(number < 0) {
            return -1;
        }
        int places = 1;
        while(number >= 10) {
            places = places + 1;
            number = number / 10;
        }
        return places;
    }

    //Coding Exercise: Flour Pack Problem
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0 || ((bigCount * 5) + smallCount) < goal) {
            return false;
        }
        if (goal < 5 || goal < smallCount) {
            return (smallCount >= goal);
        }
        int level = 0;
        while ((goal - level >= 5) && bigCount > 0) {
            level += 5;
            bigCount--;
        }
        return (smallCount >= (goal - level));
    }

    //Coding Exercise: Flour Pack Problem

    public static int getLargestPrime(int number) {
        int highest = -1;
        boolean isPrime;
        if(number <= 0) {
            return -1;
        }
        if(number % 2 == 0){
            highest = 2;
        }
        for(int i = 3; i <= number; i += 2) {
            isPrime = true;
            if((number % i == 0) && (i % 2 != 0)) {
                for(int j = 1; j <= i / 2; j += 2) {
                    if(i % j == 0 && !(j == 1 || j == i)) {
                        isPrime = false;
                        break;
                    }
                }
                if(isPrime) {
                    highest = i;
                }
            }
        }
        return highest;
    }

    //Coding Exercise: Diagonal Star
    public static void printSquareStar(int number) {
        if(number < 5){
            System.out.println("Invalid Value");
        } else{
            String row = "";
            for(int i = 1; i <= number; i++) {
                row = "";
                for(int j = 1; j <= number; j++) {
                    if(i == 1 || i == number) {
                        row += "*";
                    } else {
                        if((i == j) || (j == (number - i + 1)) || j == 1 || j == number) {
                            row += "*";
                        } else {
                            row += " ";
                        }
                    }
                }
                System.out.println(row);
            }
        }

    }

}