package com.decisionmaking;

public class Nested_If {
    public static void main(String[] args) {
        int marks = 98;
        if (marks > 35) {
            System.out.println("pass marks");
            if (marks >= 90)
                System.out.println("grade A");
            else {
                System.out.println("not a grade A");
            }
        }else {
            System.out.println("fail marks");
        }
    }
}
