package com.DP.decoratorDP;

import com.DP.decoratorDP.Decorator.Mocha;
import com.DP.decoratorDP.Decorator.Soy;
import com.DP.decoratorDP.concreteClass.Beverage;
import com.DP.decoratorDP.concreteClass.Espresso;

public class Main {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        beverage = new Mocha(beverage);
        beverage = new Soy(beverage);

        System.out.println(beverage.getDescription() + " $ "+ beverage.cost());
    }
}