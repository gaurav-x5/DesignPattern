package org.example;

public class Main {
    public static void main(String[] args) {
        Customer customer = new CustomerBuilder()
                .firstName("Tony")
                .lastName("Stark")
                .primaryEmail("tonystark@abc.com")
                .primaryMobileNumber("1234567890")
                .build();

        System.out.println(customer.toString());
    }
}