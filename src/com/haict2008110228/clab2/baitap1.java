package com.haict2008110228.clab2;

import java.util.Scanner;

public class baitap1 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Giải phương trình dạng ax+b=0");
        System.out.print("Nhập vào 2 hệ số a và b:");
        Double a= scanner.nextDouble();
        Double b= scanner.nextDouble();
        if(a==0)
        {
            if(b==0)
            System.out.println("Phương trình vô số nghiệm");
            else System.out.println("Phương trình vô nghiệm");


        }
        else 
        {
        Double x=-b/a;
        System.out.println("Nghiệm của phương trình là x="+x);
        }


    }
    
}
