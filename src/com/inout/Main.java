package com.inout;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a;
        int b;
        int c;
        String sign;
        String nextSign;
        int result = 0;


//if(result>0) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please input first number:");
        a = sc.nextInt();
        sc.nextLine();
        System.out.println("Please select sing of operation ");
        sign = sc.nextLine();
//      sc.nextLine();
        System.out.println("Input second number: ");
        b = sc.nextInt();
        //sc.close();
        System.out.println("=");

        if (sign.equals("+")) {
            result = a + b;
            System.out.println("Result: " + a + " + " + b + " = " + result);

        } else if (sign.equals("-")) {
            result = a - b;
            System.out.println("Result: " + a + " - " + b + " = " + result);

        } else if (sign.equals("*")) {
            result = a * b;
            System.out.println("Result: " + a + " * " + b + " = " + result);

        } else if (sign.equals("/")) {
            result = a / b;
            System.out.println("Result: " + a + " / " + b + " = " + result);

        } else {
            System.out.println("Not a correct operation sign!");
        }

        System.out.println("How many operation you want to proceed?");
        sc.nextLine();
        int i;
        i = sc.nextInt();
        System.out.println(i);
        while (i>0) {

    System.out.println("Any other operation? Please select an operation sign or write <quit> to quit");
    sc.nextLine();
    nextSign = sc.nextLine();

    System.out.println("Input next number: ");
    c = sc.nextInt();
    //sc.close();
    int result2;
    if (nextSign.equals("+")) {
        result2 = result;
        result = result + c;
        System.out.println("Result: " + result2 + " + " + c + " = " + result);

    } else if (nextSign.equals("-")) {
        result2 = result;
        result = result - c;
        System.out.println("Result: " + result2 + " - " + c + " = " + result);

    } else if (nextSign.equals("*")) {
        result2 = result;
        result = result * c;
        System.out.println("Result: " + result2 + " * " + c + " = " + result);

    } else if (nextSign.equals("/")) {
        result2 = result;
        result = result / c;
        System.out.println("Result: " + result2 + " / " + c + " = " + result);

    } else if (nextSign.equals("quit")) {
        System.out.println("Goodbye!");
        i=0;
    }
    i--;
}}}

        //}
//       System.out.println(a+b);
//        System.out.println("Dodawanie, podaj pierwsza liczbe:");
//        a = sc.nextInt();
//        System.out.println("+");
//        b = sc.nextInt();
//        System.out.println("=");
//        System.out.println(a+b);
//         int x = sc.nextInt();
//          System.out.println(x);


