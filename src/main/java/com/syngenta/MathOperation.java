package com.syngenta;

import java.util.Scanner;

public class MathOperation {

    int add(int a, int b) {
        int c=  a + b;
        return c;
    }
    public static void main(String[] args)
    {
        int c=0;
        MathOperation a1 = new MathOperation();
        //a1.add();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1 number :");
        int a = scanner.nextInt();
        System.out.println("Enter 2 number: ");
        int b = scanner.nextInt();
        c= a1.add(a , b);
        System.out.println("result: "+ c);


    }


}
