package com.haict2008110228.lab5;


public class Book {
    String NhaXuatBan;
    double NamXuatBan;
    double GiaBan;
    int Soluong;
    String loai;
    

Book(){
    NhaXuatBan="Nguyễn Văn A";
    NamXuatBan=2021;
    GiaBan=20000;
    Soluong=100;
    loai = "Kinh tế";


}
Book(int a){
    NhaXuatBan="Trần văn B";
    NamXuatBan=a;
    GiaBan=10000;
    Soluong=10;
    loai="Chính Trị";
}
Book(int b, int c){
NhaXuatBan="Nguyễn Văn C";
NamXuatBan=2009;
GiaBan=b;
Soluong=c;
loai="Truyện";

}
void xuatThongTin(){
    System.out.println("Nhà Xuất bản: "+NhaXuatBan);
    System.out.println("Năm Xuất Bản:"+NamXuatBan);
    System.out.print("giá bán là:"+GiaBan);
    System.out.println(" VNĐ");
    System.out.print("Số Lượng:"+Soluong);
    System.out.println("cuốn");
    System.out.println("loại:"+loai);

}
double Tinhtien(int Soluong){
    double Tongtien;
    Tongtien= Soluong*GiaBan;
    return Tongtien;

}
}

