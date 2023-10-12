package com.java.assign;

import java.util.Scanner;

//UserInterface class
public class UserInterface {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     System.out.println("Enter Customer Name");
     String customerName = scanner.nextLine();

     System.out.println("Enter Phone Number");
     long phoneNumber = Long.parseLong(scanner.nextLine());

     System.out.println("Enter address");
     String address = scanner.nextLine();

     System.out.println("Enter Bero Type");
     String beroType = scanner.nextLine();

     CustomerDetails customer = new CustomerDetails(customerName, phoneNumber, address);

     if (beroType.equals("Steel Bero")) {
    	 
         System.out.println("Enter Bero Colour");
         String beroColour = scanner.nextLine();
         System.out.println("Enter Bero Height");
         int beroHeight = Integer.parseInt(scanner.nextLine());
         SteelBero steelBero = new SteelBero(beroType, beroColour, beroHeight);
         double discount = new Discount().calculateDiscount(steelBero);
         double totalPrice = steelBero.getPrice() - discount;
         System.out.printf("Amount needs to be paid %.2f%n", totalPrice);
         
     } else if (beroType.equals("Wooden Bero")) {
    	 
         System.out.println("Enter Bero Colour");
         String beroColour = scanner.nextLine();
         System.out.println("Enter Wood Type");
         String woodType = scanner.nextLine();
         WoodenBero woodenBero = new WoodenBero(beroType, beroColour, woodType);
         double discount = new Discount().calculateDiscount(woodenBero);
         double totalPrice = woodenBero.getPrice() - discount;
         System.out.printf("Amount needs to be paid %.2f%n", totalPrice);
         
     } else {
         System.out.println(beroType + " is an invalid bero type");
     }

     scanner.close();
 }
}