package com.bridgelabz;

import java.util.Scanner;

public class Generics {
    public static void main(String[] args){ //Entry Point of code
        Scanner scanner = new Scanner(System.in); //Make scanner obj
        System.out.println("Enter three numbers: ");
        Integer x = scanner.nextInt();  //INPUT Int
        Integer y = scanner.nextInt();
        Integer z = scanner.nextInt();
        Integer max = -2147483648;   // ( or int myMaxIntValue= Integer.MAX_VALUE)
        int result = x.compareTo(max); // method compares the given string with the current string
        if (result == 1) {
            max = x;
        }
        result = y.compareTo(max);
        if (result == 1) {
            max = y;
        }
        result = z.compareTo(max);
        if (result == 1) {
            max = z;
        }
        System.out.println("The max number is : " + max);
    }
}
