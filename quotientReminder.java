package com.BridgelabzBasicCore;
import java.util.Scanner;

public class quotientReminder {
    public static void main (String[] args){
        Scanner s = new Scanner(System.in);
        int dividend = 0, divisor = 0,quotient = 0, reminder = 0 ;
        System.out.println("Enter the dividend:");
        dividend = s.nextInt();
        System.out.println("Enter the divisor:");
        divisor = s.nextInt();

        quotient =  dividend / divisor ;
        reminder =  dividend % divisor ;
        System.out.println("The Quotient is " +quotient);
        System.out.println("The reminder is " +reminder);
    }
}
