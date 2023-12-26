package org.example;

public class NonVegBurger implements Burger{
    @Override
    public void prepare() {
        System.out.println("Preparing NonVeg Burger..");
    }
}
