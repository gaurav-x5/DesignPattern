package org.example;

public class NonVegBurgerRestaurant extends Restaurant{
    @Override
    public Burger createBurger() {
        System.out.println("Creating Beef Burger...");
        return new NonVegBurger();
    }
}
