package com.haict2008110228.clab2;

import java.util.Scanner;



public class baitap2 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Giải phương trình bậc 2");
        System.out.print("Nhập vào hệ số a :");
        Double a= scanner.nextDouble();
        System.out.print("nhập vào hệ số b:");
        Double b= scanner.nextDouble();
        System.out.print("nhập vào hệ số c:");
        Double c= scanner.nextDouble();
        if(a==0)
        {
            if(b==0)
            {
                if(c==0)
                System.out.println("PT vô số nghiệm");
                else 
                System.out.println("PT vô Nghiệm");
            }
            else
            {
                Double x=-c/b;
                System.out.printf("Pt có nghiệm x=",+x);
            }
        }
        else
        { Double Delta= Math.pow(b, 2)-4*a*c;
            if(Delta<0)
            System.out.println("Pt vô nghiệm");
            else if(Delta==0)
            {
                double x=-b/(2*a);
                System.out.println("Phương trình có nghiệm kép:"+x);

            }
            else 
            {
                double canDelta=Math.sqrt(Delta);
                double x1=(-b+canDelta)/(2*a);
                double x2=(-b-canDelta)/(2*a);
                System.out.println("Phương trình có hai nghiệm phân biệt");
                System.out.printf("Nghiệm x1:%.2f\n",x1);
                System.out.printf("Nghiệm x2:%.2f",x2);
                
            }
        }
    }

        }

          