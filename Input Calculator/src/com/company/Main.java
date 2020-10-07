package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println(getBucketCount(3.26, .75));
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
        if(width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        }
        double area = width * height;
        int totalBuckets = (int) Math.ceil(area/areaPerBucket);

        return totalBuckets - extraBuckets;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        return getBucketCount(width, height, areaPerBucket, 0);
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        return getBucketCount(area, 1, areaPerBucket);
    }
}
