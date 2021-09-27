package com.haict2008110228.clab1;

import java.util.Scanner;

public class baitap2 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("chiều dài của HCN: ");
        double dai= scanner.nextDouble();
        System.out.print("chiều rộng của HCN: ");
        double rong = scanner.nextDouble();
        double chuVi=(dai+ rong)*2;
        System.out.println("chu vi cua HCN:"+ chuVi);
        double dienTich= dai+rong;
        System.out.println("diện tích của HCN:"+dienTich);
        double canhNhoNhat=Math.min(dai,rong);
        System.out.println("cạnh nhỏ nhất của hình chữ nhật:"+canhNhoNhat);
        
    }
    
}
