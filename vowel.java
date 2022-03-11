package com.BridgelabzBasicCore;

import java.util.Scanner;

public class vowel {
        public static void findtype ( char c)
        {
            switch (c)
            {
                case 'a' : System.out.println("Its a vowel");
                    break;
                case 'e' : System.out.println("Its a vowel");
                    break;
                case 'i' : System.out.println("Its a vowel");
                    break;
                case 'o': System.out.println("Its a vowel");
                    break;
                case 'u' : System.out.println("Its a vowel");
                    break;
                case 'A' : System.out.println("Its a vowel");
                    break;
                case 'E' : System.out.println("Its a vowel");
                    break;
                case 'I' : System.out.println("Its a vowel");
                    break;
                case 'O': System.out.println("Its a vowel");
                    break;
                case 'U' : System.out.println("Its a vowel");
                    break;
                default: System.out.println("Char is constant");
                    break;
            }
        }

        public static void main (String [] args)
        {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter the charter to check vowel or not");
            char c = s.next().charAt(0);
            findtype(c);
        }



    }
