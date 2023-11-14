package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Prepare Tea");
        CaffeineBeverage caffeineBeverage = new Tea();
        caffeineBeverage.prepareRecipe();

        System.out.println("___________________________________________________");
        System.out.println("Prepare Coffee");
        caffeineBeverage = new Coffee();
        caffeineBeverage.prepareRecipe();
    }
}