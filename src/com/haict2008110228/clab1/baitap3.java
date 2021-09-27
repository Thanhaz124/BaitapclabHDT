package com.haict2008110228.clab1;

import java.util.Scanner;

public class baitap3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Nhập kích thước của lập phương cần tính:   ");
        double canh=scanner.nextDouble();
        double theTich=Math.pow(canh,3);
        System.out.println("thể tích khối lập phương là:"+theTich);
    } 
}
