package com.DP.decoratorDP.Decorator;

import com.DP.decoratorDP.concreteClass.Beverage;

//we need to be interchangeable with beverage so we extend Beverage clas
public abstract class CondimentDecorator extends Beverage {
    //Here the Beverage that each Decorator will be wrapping, Notice we are using the Beverage supertype
    // to refer to the Beverage so the Decorator can wrap any beverage
    Beverage beverage;
    //We are going to require that thr condiment decorators all reimplement the getDescription() method again.
    public abstract String getDescription();

}
