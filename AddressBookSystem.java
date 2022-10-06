package com.Bridgelabz.Address_Book_System;

import java.util.Scanner;

public class AddressBookSystem {
    public static void main(String[] args) {
        System.out.println("*_*_*_*_*_*_*_*_*_*_Welcome to Address Book_*_*_*_*_*_*_*_*_*_*");
        Contact contact = new Contact();
        int choice;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println(" Enter 1 to Add Contact \n Enter 2 to Update Contact \n Enter 3 To Delete Contact \n Enter 4 To Show Added Contacts ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    contact.addUser();
                    System.out.println();
                    System.out.println("Added Successfully...");
                    System.out.println();
                    break;

                case 2:
                    contact.update();
                    break;

                case 3:
                    contact.deleteContact();
                    break;

                case 4:
                    contact.display();
                    break;

                default:
                    System.out.println("You have Entered Wrong Choice ");
                    System.out.println();
            }
        }
    }
}
