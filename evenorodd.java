package com.BridgelabzBasicCore;
import java.util.Scanner;
    public class evenorodd {

        public static void findnum(int n)
        {
            if (( n % 2) == 0 )
            {
                System.out.println("The number is even");
            } else
            {
                System.out.println("The number is odd");
            }
        }
        public static void main ( String [] args)
        {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter the number: \n");
            int n = s.nextInt();
            findnum(n);
        }
    }
