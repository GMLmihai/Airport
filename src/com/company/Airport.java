package com.company;

import com.company.model.*;

public class Airport {


    public static void main(String[] args) {
        AiportOperator aiportOperator = new AiportOperator();
       Passanger passangerVasile =  aiportOperator.createPassenger("Vasile", 32, "12345678", 1233445657L, "Str. Lapusneanu",
                "2A", "Craiova", Country.ROMANIA, "20");

        Passanger passangerAdrian =  aiportOperator.createPassenger("Adrian", 23, "12345238", 1222445657L, "Str. Uk",
                "2A", "London", Country.UK, "22");

        Passanger passangerMihai =  aiportOperator.createPassenger("Mihai", 28, "12345623", 1233445657L, "Str. Lapusneanu",
                "2A", "Bucuresti", Country.ROMANIA, "24");

        Passanger[] passangers = new Passanger[2];
        passangers[0] = passangerVasile;
        passangers[1] = passangerAdrian;

        Passanger[] passangers1 = new Passanger[3];
        passangers1[0] = passangerAdrian;
        passangers1[1] = passangerMihai;
        passangers1[2] = passangerVasile;
        Plane planeBoeing = aiportOperator.createPlane(BoeingPlane.BOEING, "A303", 900, passangers);
        Plane planeAirbus = aiportOperator.createPlane(AirBusPlane.AIRBUS, "A302", 970, passangers1);

    Plane[] planes = new Plane[3];
    planes[0] = planeAirbus;
    planes[1] = planeBoeing;
    planes[2] = new WorldPlane();
    aiportOperator.flyPlanes(planes);

    }
}
