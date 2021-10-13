package com.haict2008110228.lab5;

public class TaiKhoan {
    String TenTaiKhoan;
    int SoTaiKhoan;
    int SoDu;
    TaiKhoan(){
        TenTaiKhoan="Nguyễn văn B";
        SoTaiKhoan=0001;
        SoDu=2000;


    }
    TaiKhoan(int a){
        TenTaiKhoan="Trần D";
        SoTaiKhoan=a;
        SoDu=3000;
    }
    TaiKhoan(int a, int b){
        TenTaiKhoan="Hồ Văn x";
        SoTaiKhoan=a;
        SoDu=b;
    }
    void XuatThongTin(){
        System.out.println("Tên chủ tài khoản :"+TenTaiKhoan);
        System.out.println("Số tài Khoản:"+SoTaiKhoan);
        System.out.println("Số dư tài khoản:"+SoDu);
    }
    int guiTien(int SoTienGui){
        SoDu=SoDu+SoTienGui;
        return SoDu;
    }
    int rutTien(int soTienRut){
        SoDu=SoDu-soTienRut;
        return SoDu;
    }

    
}
