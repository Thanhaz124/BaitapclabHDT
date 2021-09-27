package com.haict2008110228.clab1;

import java.util.Scanner;

public class baitap1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Họ và tên:");
        String hoTen=scanner.nextLine();
        System.out.print("điểm  TB:");
        double diemTB=scanner.nextDouble();
        System.out.printf("%s %.2f điểm",hoTen,diemTB);
    }
    
}
