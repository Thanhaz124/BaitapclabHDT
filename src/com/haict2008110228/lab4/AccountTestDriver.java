package com.haict2008110228.lab4;
import java.util.Scanner;

public class AccountTestDriver {
    public static void main(String[] args) {
        Account account;
        account= new Account();
        
        Scanner scanner =new Scanner(System.in);
        System.out.print("Bạn muốn gửi bao nhiêu tiền:");
        int a =scanner.nextInt();
        account.deposit(a);
        account.showData();
        System.out.print("bạn muốn rút bao nhiêu tiền:");
        int b=scanner.nextInt();
        account.withdraw(b);
        account.showData();

    }
    
}
