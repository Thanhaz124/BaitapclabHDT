package com.haict2008110228.lab5;



public class computer{
    String NhaSanXuat;
    double NamSanXuat;
    String HeDieuHanh;
    int  Ram;
    String CPU;
    double Gia;

    int NamBaoHanh;
    computer(){
    NhaSanXuat= "Asus";
    NamSanXuat=2021;
    HeDieuHanh="Windown 10";
    Ram= 8;
    CPU="Intel core i7 10700F";
    Gia=22;

    }
    computer(String a){
    NhaSanXuat=a;
    NamSanXuat=2021;
    HeDieuHanh="Windown 10";
    Ram= 16;
    CPU="Intel core i5 10900F";
    Gia=19;
    }
    computer(int b,int c){
        NhaSanXuat="Acer";
        NamSanXuat=2021;
        HeDieuHanh="Windown 10";
        Ram= b;
        CPU="Intel core i5 10900F";
        Gia=c;   

    }
    void XuatThongTin(){
        System.out.println("Nhà sản xuất :"+NhaSanXuat);
        System.out.print("Năm sản xuất: "+NamSanXuat);
        System.out.println("Hệ điều hành :"+HeDieuHanh);
        System.out.print("Ram: "+Ram);
        System.out.println("GB");
        System.out.println("CPU :"+CPU);
        System.out.print("Giá Bán :"+Gia);
        System.out.println(" triêu đồng.");
    }
    double TinhTien(int soLuong){
        double Tien;
        Tien= soLuong*Gia;
        return Tien;
    }



    
}
