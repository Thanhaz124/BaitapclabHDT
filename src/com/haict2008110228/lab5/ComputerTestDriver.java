package com.haict2008110228.lab5;



public class ComputerTestDriver {
    public static void main(String[] args) {
        computer computer;
        computer= new computer();
        computer.XuatThongTin();
        System.out.print("tổng tiền của 4 máy tính la:"+computer.TinhTien(4));
        System.out.println(" triệu đồng.");
        computer=new computer("Lenovo");
        computer.XuatThongTin();
        System.out.print("tổng tiền của 4 máy tính la:"+computer.TinhTien(4));
        System.out.println(" triệu đồng.");
        computer=new computer(8,15);
        computer.XuatThongTin();
        System.out.print("tổng tiền của 4 máy tính la:"+computer.TinhTien(4));
        System.out.println(" triệu đồng.");



        
    }
    
}
