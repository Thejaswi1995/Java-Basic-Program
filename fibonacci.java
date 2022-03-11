package com.BridgelabzBasicCore;

import java.util.Scanner;

public class fibonacci {
    public static void Compute(int n){
    int num1 =0 ,num2 =1;
    int counter=0;
    while(counter<n)
    {
        System.out.println( num1 + " ");

        int num3 = num1 + num2;
        num1=num2;
        num2=num3;
        counter=counter+1;

    }
}
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number : \n");
        int n = s.nextInt();
        Compute(n);
    }}
