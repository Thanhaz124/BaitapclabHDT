package com.haict2008110228.clab3;

import java.util.Scanner;

public class baitap1 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("nhập vào số nguyên:");
        int a=scanner.nextInt();
        int souoc=0;
        for(int i=1;i<=a;i++){
            if(a%i==0){
                souoc++;
            }

        } if(souoc==2){
            System.out.print(""+a);
            System.out.println(" là số nguyên tố");
        }
        else{ 
            System.out.print(""+a);
            System.out.println(" không phải là số nguyên tố");
        }
    }
    
}
