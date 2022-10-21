package com.bridgelabz;
import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    public void addNewContact(){
        ArrayList<Contact> array = new ArrayList<Contact>();
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1.Adding New Contact");
            System.out.println("2.Check Added Contact");
            System.out.println("Enter your choice");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    Scanner input=new Scanner(System.in);
                    System.out.println("Enter the details of contact person");
                    System.out.print("Enter first name:");
                    String firstName=input.nextLine();
                    System.out.print("Enter last name:");
                    String lastName=input.nextLine();
                    System.out.print("Enter address:");
                    String address=input.nextLine();
                    System.out.print("Enter city:");
                    String city=input.nextLine();
                    System.out.print("Enter state:");
                    String state=input.nextLine();
                    System.out.print("Enter zipcode:");
                    String zipCode=input.nextLine();
                    System.out.print("Enter phone number:");
                    String phoneNo=input.nextLine();
                    System.out.print("Enter email:");
                    String email=input.nextLine();

                    Contact contact = new Contact(firstName, lastName, address, city, zipCode, state, phoneNo,
                            email);
                    array.add(contact);
                    break;
                case 2:
                    System.out.println(array);
                    break;
            }
        } while (choice == 1 || choice == 2);
        System.out.println("Invalid Choice!!!");
    }
}
