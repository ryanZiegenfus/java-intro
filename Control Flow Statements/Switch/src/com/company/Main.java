package com.company;

public class Main {

    public static void main(String[] args) {
//	    int switchValue = 1;
//
//        switch(switchValue) {
//            case 1:
//                System.out.println("Value was 1");
//                break;
//
//            case 2:
//                System.out.println("Value was 2");
//                break;
//
//            case 3: case 4: case 5:
//                System.out.println("Value was 3 or 4 or 5");
//                break;
//
//            default:
//                System.out.println("Was not 1 or 2 or 3 or 4 or 5");
//                break;
//        }

        char letter = 'A';

        switch(letter) {
            case 'A':case 'B':case 'C':case 'D':case 'E':
                System.out.println("Letter found");
                break;
            default:
                System.out.println("Letter not found");
        }
    }
}
