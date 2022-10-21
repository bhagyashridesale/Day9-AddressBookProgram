package com.bridgelabz;
public class Contact {
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String zip;
    private String state;
    private String phoneNo;
    private String email;

    public Contact() {
        // TODO Auto-generated constructor stub
    }
    public Contact(String firstName, String lastName, String address, String city, String zip, String state, String phoneNo,String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.zip = zip;
        this.state = state;
        this.phoneNo = phoneNo;
        this.email = email;
    }
    @Override public String toString() {
        return "Contact [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", city=" + city
                + ", zip=" + zip + ", state=" + state + ", phoneNo=" + phoneNo + ", email=" + email + "]";
    }
}
