package com.company;
import java.util.Scanner;
public class TakingInput{
    public static void main(String[] args){
        System.out.println("Taking input from the user ");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        float a=sc.nextFloat();
        System.out.println("Enter second number");
        float b=sc.nextFloat();
        float sum=a+b;
        System.out.println("sum of these numbers");
        System.out.println(sum);
    }
 }