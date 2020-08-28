package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        lesson();
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
        
    }
}
