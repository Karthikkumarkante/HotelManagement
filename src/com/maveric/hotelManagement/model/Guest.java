package com.maveric.hotelManagement.model;

public class Guest {
    long id;
    String firstName;
    String lastName;
    String emailId;

    public Guest(long id, String firstName, String lastName, String emailId) {
        id++;
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailId = emailId;
    }

    @Override
    public String toString() {
        return "Guest{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", emailId='" + emailId + '\'' +
                '}';
    }
}
