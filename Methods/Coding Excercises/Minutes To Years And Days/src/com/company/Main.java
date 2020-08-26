package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static void printYearsAndDays(long minutes) {
        if(minutes < 0){
            System.out.println("Invalid Value");
        } else {
            long years = (minutes / (24*60) / 365);
            long remainingDays = ((minutes / (24 * 60)) % 365);
            System.out.println(minutes + " min = " + years + " y and " + remainingDays + " d" );
        }

    }
}
