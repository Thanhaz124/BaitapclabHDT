package com.haict2008110228.lab5;


public class Cow {
    double weight;
    double age;
    Cow(){
        weight=150;
        age =5;
    }
    Cow(double w){
        weight=w;
        age=3;


    }
    Cow(double w, double a){
        weight=w;
        age=a;
    }
    void XuatThongTin(){
        System.out.print("Cân nặng là :"+weight);
        System.out.println(" kg");
        System.out.print("tuổi là:"+age);
        System.out.println("tuổi");
    }
    void moo(){
        System.out.println("Bee beee e e .....");
    }

    
}
