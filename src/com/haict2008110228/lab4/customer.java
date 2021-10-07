package com.haict2008110228.lab4;


import java.util.Scanner;

public class customer {
    String name;
    String address;
    Scanner scanner = new Scanner(System.in);
    void getName()
    {
        System.out.print("Họ và tên của khách hàng");
        name =scanner.nextLine();
    }
    void getAddress(){
        address = scanner.nextLine();
        System.out.print("Địa chỉ khách hàng :");

    }
    void ShowData(){
        System.out.println("Tên khách hàng:"+name);
        System.out.println("địa chỉ khách hàng:"+address);
    }

    
}
