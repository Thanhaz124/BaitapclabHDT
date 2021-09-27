package com.haict2008110228.clab2;
import java.util.Scanner;

public class baitap3 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Nhập số điện đã sử dụng:");
        Double soDien=scanner.nextDouble();
        if(soDien<=50)
        {
           
            System.out.println("điện của bạn chưa vượt mức");
            Double tientra=soDien*1000;
            System.out.print("Tiền bạn cần phải trả:"+tientra);
            System.out.println(" VNĐ");



        }
        else if(soDien>50){
        System.out.println("điện của bạn đã vượt mức");
       Double tienVuotMuc=50*1000+(soDien-50)*1200;
       System.out.print(" tiền cần phải trả là :"+tienVuotMuc);
       System.out.println("VNĐ");



    }
    else 
    System.out.println(" số  điện bạn vừa nhập sai vui lòng nhập lại");}
    
}
