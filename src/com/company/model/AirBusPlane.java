package com.company.model;

public class AirBusPlane extends Plane implements Flyable {

    public static final String AIRBUS = "AIRBUS";

    @Override
    public void fly() {
        System.out.println("This AirBus" + super.getModel() + "is flying!");
    }
}
