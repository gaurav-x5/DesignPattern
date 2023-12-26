package org.example;

public class Main {
    public static void main(String[] args) {
        Restaurant nonVegResto = new NonVegBurgerRestaurant();
        nonVegResto.orderBurger();

        System.out.println("==========================================");

        Restaurant veggieResto = new VeggieBurgerRestaurant();
        veggieResto.orderBurger();
    }
}