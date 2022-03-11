package com.BridgelabzBasicCore;
public class largestThreeNumbers {

    public static void main (String[] args){
        int n1 = 10 ,n2 = 30 , n3 = 50;
        if ( (n1 > n2) && (n1 > n3))

            System.out.println("The greatest number is " +n1);
else if ( (n2 > n1) && (n2 > n3))
            System.out.println("The greatest number is " +n2);

else
            System.out.println("The greatest number is " +n3);
        }
    }
