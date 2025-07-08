package com.palindrome;

import java.util.Scanner;

public class primecheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a num:");
        int num = sc.nextInt();
        if (num <= 1) {
            System.out.println("not a prime");
            return;
        }
        boolean prime = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                prime = false;
                break;
            }

        }
        if (prime)
            System.out.println(num + "is a prime");
        else
            System.out.println(num + "is not a prime");
    }
        }


