package com.palindrome;

import java.util.Scanner;

public class Palindrome_Num {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a number");
        int number = scanner.nextInt();
        int originalnumber = number;
        int reversenumber = 0;
        while(number > 0) {
            int digit = number % 10;
            reversenumber = reversenumber * 10 + digit;
            number = number/10;
        }
        if (originalnumber == reversenumber) {
            System.out.println(originalnumber + "is a palindrome number.");
        }else {
            System.out.println(originalnumber + "is not a palindrome number");
            scanner.close();
        }
        }
        }

