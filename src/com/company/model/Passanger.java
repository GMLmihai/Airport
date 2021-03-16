package com.company.model;

import java.util.Objects;

public class Passanger extends Person {
   private String passangerSeat;


    @Override
    public Passport showIs() {
        return super.getPassport();
    }

    public String getPassangerSeat() {
        return passangerSeat;
    }

    public void setPassangerSeat(String passangerSeat) {
        this.passangerSeat = passangerSeat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passanger passanger = (Passanger) o;
        return Objects.equals(passangerSeat, passanger.passangerSeat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passangerSeat);
    }
}
