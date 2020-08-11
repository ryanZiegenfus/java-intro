package com.company;

public class Main {

    public static void main(String[] args) {
        
        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);
        int previousResult = result;
        System.out.println("previousResult = " + previousResult);
        result = result - 1;
        System.out.println("3 - 1 = " + result);
        System.out.println("previousResult = " + previousResult);

        result = result * 10;
        System.out.println("2 * 10 = " + result);

        result = result / 5;
        System.out.println("20 / 5 = " + result);

        result = result % 3;
        System.out.println("4 % 3 = " + result);

        // result = result + 1
        result++;
        System.out.println("1 + 1 = " + result);

        result--;
        System.out.println("2 - 1 = " + result);

        //result = result + 2
        result += 2;
        System.out.println("1 + 2 = " + result);

        //result = result * 10
        result *= 10;
        System.out.println("3 * 10 = " + result);

        //result = result / 3
        result /= 3;
        System.out.println("30 / 3 = " + result);

        //result = result - 2
        result -= 2;
        System.out.println("10 - 2 = " + result);

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an alien!");
            System.out.println("And I am scared of aliens");
        }

        int topScore = 80;
        int secondTopScore = 60;
        if (topScore != 100) {
            System.out.println("You got the high score!");
        }

        secondTopScore = 81;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second top score and less than 100");
        }

        if ((topScore > 90) || (secondTopScore <= 100)) {
            System.out.println("Either or both of the conditions are true");
        }

        //!not operator - skip

        // ternary => expression ? true : false;

        // Challenge
        double doubleVar = 20.00d;
        double secondDoubleVar = 80.00d;

        double sumResult = (doubleVar + secondDoubleVar) * 100;
        System.out.println("sumResult: " + sumResult);

        double remainderOfSum = sumResult % 40.00;

        boolean noRemainder = remainderOfSum == 0 ? true : false;
        System.out.println("Boolean output: " + noRemainder);

        if (!noRemainder) {
            System.out.println("Got some remainder");
        }
    }

}
