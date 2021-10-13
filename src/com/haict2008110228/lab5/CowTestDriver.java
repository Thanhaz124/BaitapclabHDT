package com.haict2008110228.lab5;

public class CowTestDriver {
    public static void main(String[] args) {
        Cow cow;
        cow=new Cow();
        cow.XuatThongTin();
        cow.moo();
        cow=new Cow(150);
        cow.XuatThongTin();
        cow.moo();
        cow=new Cow(120, 3);
        cow.XuatThongTin();
        cow.moo();


    }
    
}
