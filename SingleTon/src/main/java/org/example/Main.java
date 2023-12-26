package org.example;

public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance("gaurav");
        System.out.println("single Instance --> " + singleton);
    }
}