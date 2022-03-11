package com.BridgelabzBasicCore;

import java.util.Scanner;

    public class powerOf2 {
        public static void findpow(int pow) {
            int power = 1;
            int i;
            int two = 2;
            for (i = 1; i <= pow; i++) {
                power = power*two;
            }
            System.out.println(" The power of 2 to the entered no is :" + power);
        }
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter the number : \n");
            int pow = s.nextInt();
            findpow(pow);

        }
    }

