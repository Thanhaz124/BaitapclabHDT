package com.haict2008110228.clab2;

import java.util.Scanner;

public class baitap4 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int luaChon;
        do{
            System.out.println("*===================MENU====================");
            System.out.println("1-Giải phương trình bậc nhất                ");
            System.out.println("2-Giải phương trình bậc hai                 ");
            System.out.println("3-Tính tiền điện                            ");
            System.out.println("4-Thoát chương trình                        ");
            System.out.println("*==========================================*");
            System.out.println("nhập sự lựa chọn:");
            luaChon=scanner.nextInt();
            switch(luaChon)
            {
                case 1:{
                    System.out.println("Giải phương trình bậc nhất");
                    System.out.print("Nhập vào 2 hệ số a và b:");
                    Double a= scanner.nextDouble();
                    Double b= scanner.nextDouble();
                    if(a==0)
                    {
                        if(b==0)
                        System.out.println("Phương trình vô số nghiệm");
                        else System.out.println("Phương trình vô nghiệm");
            
            
                    }
                    else 
                    {
                    Double x=-b/a;
                    System.out.println("Nghiệm của phương trình là x="+x);
                    break;
                    }

            
            
                    }
                case 2:{System.out.println("Giải phương trình bậc 2");
                System.out.print("Nhập vào hệ số a :");
                Double a= scanner.nextDouble();
                System.out.print("nhập vào hệ số b:");
                Double b= scanner.nextDouble();
                System.out.print("nhập vào hệ số c:");
                Double c= scanner.nextDouble();
                if(a==0)
                {
                    if(b==0)
                    {
                        if(c==0)
                        System.out.println("PT vô số nghiệm");
                        else 
                        System.out.println("PT vô Nghiệm");
                    }
                    else
                    {
                        Double x=-c/b;
                        System.out.printf("Pt có nghiệm x=",+x);
                    }
                }
                else
                { Double Delta= Math.pow(b, 2)-4*a*c;
                    if(Delta<0)
                    System.out.println("Pt vô nghiệm");
                    else if(Delta==0)
                    {
                        double x=-b/(2*a);
                        System.out.println("Phương trình có nghiệm kép:"+x);
        
                    }
                    else 
                    {
                        double canDelta=Math.sqrt(Delta);
                        double x1=(-b+canDelta)/(2*a);
                        double x2=(-b-canDelta)/(2*a);
                        System.out.println("Phương trình có hai nghiệm phân biệt");
                        System.out.printf("Nghiệm x1:%.2f\n",x1);
                        System.out.printf("Nghiệm x2:%.2f",x2);
                        break;
                        
                    }
                }
            }

               case 3:{
                System.out.println("Nhập số điện đã sử dụng:");
                Double soDien=scanner.nextDouble();
                if(soDien<=50)
                {
                   
                    System.out.println("điện của bạn chưa vượt mức");
                    Double tientra=soDien*1000;
                    System.out.print("Tiền bạn cần phải trả:"+tientra);
                    System.out.println(" VNĐ");
        
        
        
                }
                else if(soDien>50){
                System.out.println("điện của bạn đã vượt mức");
               Double tienVuotMuc=50*1000+(soDien-50)*1200;
               System.out.print(" tiền cần phải trả là :"+tienVuotMuc);
               System.out.println("VNĐ");
        
        
        
            }
            else 
            System.out.println(" số  điện bạn vừa nhập sai vui lòng nhập lại");
            break;
        }
        case 4:break;}

               
        }while(luaChon<4&&luaChon>0);
    }

        
    
    
}
