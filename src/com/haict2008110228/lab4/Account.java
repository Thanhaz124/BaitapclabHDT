package com.haict2008110228.lab4;

public class Account {
    
    int number_account;
    int number_blance;
    
    Account(int a,int b){
number_account= a;
number_blance= b;
    }
 void showData(){
        System.out.println("Accout number" + number_account);
        System.out.println("Account blance" + number_blance);
    }
  void deposit(int amount){
      number_blance +=amount;
  }
  void withdraw(int amount){
      number_blance -=amount;


  }
        
    }
    
    

