package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        max_min_challenge();
    }

    public static void lesson() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter you year of birth: ");
        boolean hasNextInt = scanner.hasNextInt();
        if(hasNextInt) {
            int yearOfBirth = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Enter your name: ");
            String name = scanner.nextLine();
            int age = 2020 - yearOfBirth;

            if(age >= 0 && age <= 150) {
                System.out.println("Your name is " + name + ", and you are " + age + " years old.");
            } else {
                System.out.println("Invalid Year of Birth");
            }
        } else {
            System.out.println("Unable to parse year of birth.");
        }
        scanner.close();
    }

    public static void challenge() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println("Enter number #" + i);
            boolean hasNextInt = scanner.hasNextInt();
            if(hasNextInt) {
                sum += scanner.nextInt();
                scanner.nextLine();
            } else {
                System.out.println("Invalid Input");
            }
        }
        System.out.println("Sum = " + sum);
        scanner.close();
    }

    public static void max_min_challenge() {

        Scanner scanner = new Scanner(System.in);

        int min = 0;
        int max = 0;

        boolean first = true;

        while(true) {
            System.out.println("Enter number:");
            boolean isAnInt = scanner.hasNextInt();

            if(isAnInt) {
                int number = scanner.nextInt();

                if(first) {
                    first = false;
                    min = number;
                    max = number;
                }

                if(number > max) {
                    max = number;
                }

                if(number < min) {
                    min = number;
                }
            } else {
                break;
            }
        }

        System.out.println("Min: " + min + " Max: " + max);
    }
}
