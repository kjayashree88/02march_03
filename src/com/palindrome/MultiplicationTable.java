package com.palindrome;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a number: ");
        int number = scanner.nextInt();
        System.out.println("multiplication table for" + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + "x" + i + "=" + (number * i));
        }
        scanner.close();
    }
}
