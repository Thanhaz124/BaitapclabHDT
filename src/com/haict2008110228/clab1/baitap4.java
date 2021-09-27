package com.haict2008110228.clab1;
import java.util.Scanner;

public class baitap4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print(" nhập hệ số a:");
        double a=scanner.nextDouble();
        System.out.print("nhập hệ số b:");
        double b= scanner.nextDouble();
        System.out.print("nhập hệ số c:");

        double c= scanner.nextDouble();
        double Delta=Math.pow(b,2) - 4*a*c; 
        Float canDelta=(float) Math.sqrt(Delta);
       System.out.printf("Can Delta :%2f",+canDelta);

    }
    
}
