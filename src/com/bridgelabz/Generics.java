package com.bridgelabz;

public class Generics {
    /*
      E This represents generic types . this declaration has to do nothing with return type
     */
    public static  <E extends Comparable> E getMaximum(E a, E b, E c){
        E max=a;
        if(b.compareTo(a)>0 && b.compareTo(c)>0){  // compares the given string with the current
            max=b;
        }else if(c.compareTo(max)>0){
            max=c;
        }
        return max;
    }
    public static void main(String[] args){ //Entry Point of code
        System.out.println("Welcome to Test Maximum Program");
        int num1=196,num2=156,num3=659; // taking 3 value for int
        System.out.println(getMaximum(num1,num2,num3));
        float a=76.7f,b=26.6f,c=98.5f; // taking 3 value for float
        System.out.println(getMaximum(a,b,c));
        String s1="Kisalay",s2="santosh",s3="bridgelabz";  // taking 3 value for string
        System.out.println(getMaximum(s1,s2,s3));

    }
}
