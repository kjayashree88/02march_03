package com.string;
import java.util.Scanner;
public class StringOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a string to check palindrome:");
        String original = scanner.nextLine();
        String reversed = new StringBuilder(original).reverse().toString();
        if (original.equalsIgnoreCase(reversed)) {
            System.out.println("it is a palidrome.");
        }else{
            System.out.println("not a palindrome.");
        }
    }

    }
