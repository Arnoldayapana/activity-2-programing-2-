package CandyMachine;

import java.util.Scanner;


public class CandyMachine {

  public static Scanner scan = new Scanner(System.in);
  public static String again;
  public static int choice,quantity=1;
  public static double total=0,pay;
  public static void displayProduct() {
    
    System.out.println("*****HELLO" + "WELCOME TO ARNOLD'S CANDY SHOP*****");
    System.out.println();
  System.out.println(" Here is the available Item we have :)");
  System.out.println("========================");
  System.out.println("1     candy     8.00 ");
  System.out.println("2     chips    10.00 ");
  System.out.println("3     gum       5.00 ");
  System.out.println("4     cookies  15.00");
  System.out.println("0     exit ");
  System.out.println("========================");
  
  }
  public static void orders() {
    System.out.print("Please enter your item choice:");
    choice = scan.nextInt();
    
    if (choice == 1) {
    System.out.print("how manny candy would you like to buy?:");
    quantity = scan.nextInt();
    total = total + (quantity*8);
    
    System.out.println("Do you want to buy again?");
    System.out.println("Press Y for yes and N for No:");
    again = scan.next();
    if(again.equalsIgnoreCase("Y")){
      orders();
    }
    else {
    System.out.println("total price is " + total);
    System.out.println("Enter a payment");
    pay =scan.nextDouble();
    if (pay < total) {
      System.out.println("Not enough payment");
    }
    else {
    
      total = pay - total;
      System.out.println("total change is " + total);
    }
   }  
  }
  else if (choice == 2) {
    System.out.println(" how many chips would you like to buy?:");
    quantity = scan.nextInt();
    total = total + (quantity*10);
    
    System.out.println("Do you want to buy again?");
    System.out.println("Press Y for yes Press N for No:");
    again = scan.next();
    if(again.equalsIgnoreCase("Y")){
      orders();
    }
    else {
    System.out.println("total price is " + total);
    System.out.println("Enter a payment");
    pay =scan.nextDouble();
    if (pay< total) {
      System.out.print("Not enough payment");
    }else{
    
      total = pay - total;
      System.out.println("total change is " + total);
    }
    }
  }
  else if (choice == 3) {
    System.out.println("How much gum would you like to buy?");
    quantity = scan.nextInt();
    total = total + (quantity*5);
    
    System.out.println("Do you like to buy again?");
    System.out.println("press Y for Yes,press N for No:");
    again = scan.next();
    if (again.equalsIgnoreCase("Y")){
      orders();
    }
    else {
      System.out.println("total price is " + total);
      System.out.println("Enter a payment");
      pay = scan.nextDouble();
      
      if (pay<total) {
        System.out.println(" not enough payment ");
        
      }
    else {
    
      total = pay - total;
      System.out.println("total change is " + total);
    }
  }
  }
  else if (choice == 4) {
    System.out.println(" How much Cookies would you like to buy?");
    quantity = scan.nextInt();
    total = total + (quantity*15);
    
    System.out.println("Do you like to buy again?");
    System.out.println("press Y for Yes,press N for No:");
    again =scan.next();
    if(again.equalsIgnoreCase("Y")) {
      orders();
    }else {
    System.out.println("total price is " + total);
  System.out.println("Enter a payment");
  pay = scan.nextDouble();
  if (pay<total) {
  
    System.out.println(" Not enough payment");
  }else{
    
    total = pay - total;
    System.out.println(" the total change is " + total);
  }
  }
  } else if (choice ==0) {
    System.exit(0);
  }else {
    System.out.println("choose only from 1 to 4");
    orders();
  }
  }
  public static void main(String[] args) {
  
  // Display products
  displayProduct();
  // Display orders
  orders();
  
  System.out.println(" thanks for purchasing");
  System.out.println(" Enjoy :) ");
  }
}


