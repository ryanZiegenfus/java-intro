package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static boolean isLeapYear(int year) {
        if((year >= 1) && (year <= 9999)) {
            if ((year % 4) == 0) {
                if ((year % 100) == 0) {
                    if ((year % 400) == 0) {
                        return true;
                    }
                    return false;
                } else {
                    return true;
                }
            }
            return false;
        }
        return false;
    }
}
