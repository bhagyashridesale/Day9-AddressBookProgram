package com.bridgelabz;
import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    public void addNewContact() {
        ArrayList<Contact> array = new ArrayList<Contact>();
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1.Adding New Contact");
            System.out.println("2.Check Added Contact");
            System.out.println("3.Edit Added Contact");
            System.out.println("4.Delete Added Contact");

            System.out.println("Enter your choice");
            choice = sc.nextInt();

            Scanner input = new Scanner(System.in);
            switch (choice) {
                case 1:

                    System.out.println("Enter the details of contact person");
                    System.out.print("Enter first name:");
                    String firstName = input.nextLine();
                    System.out.print("Enter last name:");
                    String lastName = input.nextLine();
                    System.out.print("Enter address:");
                    String address = input.nextLine();
                    System.out.print("Enter city:");
                    String city = input.nextLine();
                    System.out.print("Enter state:");
                    String state = input.nextLine();
                    System.out.print("Enter zipcode:");
                    String zipCode = input.nextLine();
                    System.out.print("Enter phone number:");
                    String phoneNo = input.nextLine();
                    System.out.print("Enter email:");
                    String email = input.nextLine();

                    Contact contact = new Contact(firstName, lastName, address, city, zipCode, state, phoneNo, email);
                    array.add(contact);
                    break;
                case 2:
                    System.out.println(array);
                    break;
                case 3:
                    System.out.println("Enter first name of the person for update : ");
                    String firstName1 = input.nextLine();
                    for (Contact eachContact : array) {
                        if (eachContact.getFirstName().equals(firstName1)) {
                            System.out.print("Enter updated name:");
                            eachContact.setFirstName(input.nextLine());
                            System.out.print("Enter new last Name: ");
                            eachContact.setLastName(input.nextLine());
                            System.out.print("Enter new address: ");
                            eachContact.setAddress(input.nextLine());
                            System.out.print("Enter new city: ");
                            eachContact.setCity(input.nextLine());
                            System.out.print("Enter new state:");
                            eachContact.setState(input.nextLine());
                            System.out.print("Enter new zip: ");
                            eachContact.setZip(input.nextLine());
                            System.out.print("Enter phone number: ");
                            eachContact.setPhoneNo(input.nextLine());
                            System.out.print("Enter new email");
                            eachContact.setEmail(input.nextLine());
                            System.out.println();
                            System.out.println("Edit completed");
                        } else {
                            System.out.println("First name not found.");
                        }
                    }
                case 4:
                    System.out.println("Enter first name of the person for delete :");
                    firstName1 = input.next();
                    for (Contact eachContact : array) {
                        if (eachContact.getFirstName().equals(firstName1)) {
                            array.remove(eachContact);
                            System.out.println("Contact deleted");
                            break;
                        } else {
                            System.out.println("Contact not found with this name");
                        }
                    }

            }
        } while (choice == 1 || choice == 2 || choice == 3 || choice == 4);
    }
}
