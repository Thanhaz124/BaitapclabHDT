package com.haict2008110228.lab5;

public class BookTestDriver {
    public static void main(String[] args) {
        Book book;
        book=new Book();
        book.xuatThongTin();
        System.out.println("tổng tiền 10 cuốn sách: "+book.Tinhtien(10));
        book=new Book(2007);
        book.xuatThongTin();
        System.out.println("tổng tiền 4 cuốn sách: "+book.Tinhtien(4));
        book=new Book(5000,467);
        book.xuatThongTin();
        System.out.println("tổng tiền 1  cuốn sách: "+book.Tinhtien(1));
    }
    
}
