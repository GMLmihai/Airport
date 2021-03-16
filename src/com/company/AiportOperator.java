package com.company;

import com.company.model.*;

public class AiportOperator {
    public Passanger createPassenger(String name, int age, String cnp, long serialNumber, String street, String streetNumber,
                                     String city, Country country, String seat) {

        Passanger passanger = new Passanger();
        Address address = new Address();
        address.setCity(city);
        address.setCountry(country);
        address.setNumber(streetNumber);
        address.setStreet(street);
        Passport passport = new Passport();
        passport.setAge(age);
        passport.setCnp(cnp);
        passport.setName(name);
        passport.setSerialNumber(serialNumber);
        passanger.setPassangerSeat(seat);
        passanger.setAddress(address);
        passanger.setPassport(passport);

        return passanger;

    }

    public Plane createPlane(String planeType, String model, int maxSpeed, Passanger[] passangers) {
        Plane plane;

        if (planeType.equals(AirBusPlane.AIRBUS)) {
            plane = new AirBusPlane();
        } else {
            plane = new BoeingPlane();
        }
        plane.setMaxSpeed(maxSpeed);
        plane.setModel(model);
        plane.setPassangers(passangers);

        return plane;
    }

    public void  flyPlanes (Plane[] planes){
        for(Plane plane : planes ){
           if(plane instanceof Flyable) {
               ((Flyable) plane).fly();
           }
        }
    }
}
