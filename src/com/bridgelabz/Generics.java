package com.bridgelabz;

import java.util.Scanner;  //Import Scanner

public class Generics {
    public static void main(String[] args){  //Entry Point of code
        Scanner scanner = new Scanner(System.in);  //Make scanner obj
        System.out.println("Enter three numbers: ");
        Float x = scanner.nextFloat();  //INPUT Float
        Float y = scanner.nextFloat();
        Float z = scanner.nextFloat();
        Float max = 0.0f; // ( or float myMaxFloatValue= Float.MAX_VALUE)
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
