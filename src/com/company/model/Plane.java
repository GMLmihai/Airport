package com.company.model;

import java.util.Arrays;
import java.util.Objects;

public abstract class Plane {
    private  String model;
    private int maxSpeed;
    private Passanger[] passangers;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public Passanger[] getPassangers() {
        return passangers;
    }

    public void setPassangers(Passanger[] passangers) {
        this.passangers = passangers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Plane plane = (Plane) o;
        return maxSpeed == plane.maxSpeed &&
                Objects.equals(model, plane.model) &&
                Arrays.equals(passangers, plane.passangers);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(model, maxSpeed);
        result = 31 * result + Arrays.hashCode(passangers);
        return result;
    }
}
