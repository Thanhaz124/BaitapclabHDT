package com.haict2008110228.clab3;

import java.util.Scanner;

public class baitap3 {
    public static void main(String[] args) {
        int n,sum=0,temSort;
        Scanner scanner=new Scanner(System.in);
        do{
            System.out.print("Nhập số phần tử mảng:");
            n=scanner.nextInt();
        }while(n<0);
        //khởi tạo bộ nhớ
        int array[]=new int[n];
        System.out.println("nhập các phần tử của mảng:");
        for(int i=0;i<n;i++){
            System.out.print("Nhập phần tử thứ " + i +":");
            array[i]=scanner.nextInt();
        }
        //hiển thị mảng vừa nhập
        System.out.println("\n Mảng ban đầu:");
        for(int i=0;i<n;i++){
            System.out.print(array[i]+"\t");
        }
        //sắp xếp giảm dần
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<=n-1;j++){
                if(array[i]<array[j]){
                    temSort=array[i];
                    array[i]=array[j];
                    array[j]=temSort;

                }
            }
        }
        System.out.println("\n Mảng sau khi đã sắp xếp theo thứ tự giảm dần là:");
        for(int i=0;i<n;i++){
            System.out.print(array[i]+"\t");
        }
        //sắp xếp tăng dần
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<=n-1;j++){
                if(array[i]>array[j]){
                    temSort=array[i];
                    array[i]=array[j];
                    array[j]=temSort;
                }
            }
        }
        System.out.println("\n Mảng sau khi sắp xếp theo thứ tự tăng dần là:");
        for(int i=0;i<n;i++){
            System.out.print(array[i]+"\t");
        }

        
        
        
    }
    
}
