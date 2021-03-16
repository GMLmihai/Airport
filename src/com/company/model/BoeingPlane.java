package com.company.model;

public class BoeingPlane extends Plane implements Flyable {
public static final String BOEING = "BOEING";

    @Override
    public void fly() {
        System.out.println("This Boeing" + super.getModel() + "is flying!");

    }
}
