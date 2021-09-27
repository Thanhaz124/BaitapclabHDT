package com.haict2008110228.clab3;

public class baitap2 {
    public static void main(String[] args) {
        System.out.println("-------BẢNG CỬU CHƯƠNG------");
        for(int i=1;i<=10;i++){
            System.out.printf("\n----------Bảng nhân %d---------\n",i);
            for(int j=0;j<10;j++){
                System.out.printf("\t%d x %d= %d",i,j,i*j);
            }
        }
    }
    
}
