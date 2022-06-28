package com.bridgelabz;

import java.util.Scanner;

public class Generics {
    public static void main(String[] args){ //Entry Point of code
        Scanner scanner = new Scanner(System.in); // make scanner obj
        System.out.println("Enter three strings: ");
        String x = scanner.next();  // Input string
        String y = scanner.next();
        String z = scanner.next();
        String max = "";
        int result = x.compareTo(max); // method compares the given string with the current string
        if (result > 1) {
            max = x;
        }
        result = y.compareTo(max);
        if (result > 1) {
            max = y;
        }
        result = z.compareTo(max);
        if (result > 1) {
            max = z;
        }
        System.out.println("The max String is : " + max);
    }
}
