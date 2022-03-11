package com.bridgelabzBasicCore;
import java.util.Scanner;
public class leap {
    public static void checkLeapyear(int year) {
        if (year % 4 == 0) {
            System.out.println(" Its leap year ");
        } else if (year % 100 == 0) {
            System.out.println(" Its not a leap year ");
        } else if (year % 400 == 0) {
            System.out.println(" Its leap year ");
        } else {
            System.out.println("Its not a leap year");
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the year in four digits : \n");


        int year = s.nextInt();
        checkLeapyear(year);

    }

}