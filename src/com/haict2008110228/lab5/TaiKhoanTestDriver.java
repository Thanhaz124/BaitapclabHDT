package com.haict2008110228.lab5;

public class TaiKhoanTestDriver {
    public static void main(String[] args) {
        TaiKhoan taiKhoan;
        taiKhoan =new TaiKhoan();
        taiKhoan.XuatThongTin();
        taiKhoan.guiTien(300);
        taiKhoan.XuatThongTin();
        taiKhoan.rutTien(400);
        taiKhoan.XuatThongTin();
        taiKhoan= new TaiKhoan(0003);
        taiKhoan.XuatThongTin();
        taiKhoan.guiTien(900);
        taiKhoan.XuatThongTin();
        taiKhoan.rutTien(200);
        taiKhoan.XuatThongTin();
        taiKhoan= new TaiKhoan(0003,8000);
        taiKhoan.XuatThongTin();
        taiKhoan.guiTien(1000);
        taiKhoan.XuatThongTin();
        taiKhoan.rutTien(3000);
        taiKhoan.XuatThongTin();



        
    }
    
}
