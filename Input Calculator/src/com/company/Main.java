package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int avg;
        int count = 0;

        while(true) {
            System.out.println("Enter number: ");
            boolean isAnInt = scanner.hasNextInt();

            if(isAnInt){
                int number = scanner.nextInt();
                sum += number;
                count += 1;

            } else {
                break;
            }
        }
        scanner.close();
        if(count == 0){
            avg = 0;
        } else {
            avg = (int) (sum / count);

        }

        System.out.println("SUM = " + sum + " AVG = " + avg);

    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {

    }
}
