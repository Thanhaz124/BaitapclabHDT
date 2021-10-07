package com.haict2008110228.lab4;

import java.util.Scanner;

public class Employee {
    String name;
    String salary;
    Scanner scanner =new Scanner(System.in);
    void getName(){
        System.out.print("họ và tên nhân viên :");
        name = scanner.nextLine();
        System.out.print("Lương của nhân viên :");

    }
    void getSalary(){
        salary=scanner.nextLine();
        System.out.print("Lương nhân viên:");
    }
    void showData(){
        System.out.println("Tên nhân viên:"+name);
        System.out.println("Lương của nhân viên:"+salary);
    }
    
}
