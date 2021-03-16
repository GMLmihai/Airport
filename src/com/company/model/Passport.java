package com.company.model;

import java.util.Objects;

public class Passport {
    private long serialNumber;
    private String name;
    int age;
    private String cnp;

    public long getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(long serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCnp() {
        return cnp;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passport passport = (Passport) o;
        return serialNumber == passport.serialNumber &&
                age == passport.age &&
                Objects.equals(name, passport.name) &&
                Objects.equals(cnp, passport.cnp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serialNumber, name, age, cnp);
    }
}
