package org.SuperClass;

import java.util.ArrayList;

public class Contractor extends HardScapes {
    String name;
    private Crew crew;
    private Equipment equipment;
    private Design design;

    public Contractor(double cost, String name) {
        super(cost);
        this.name = name;
    }

    public Contractor(double cost, String name, Crew crew, Equipment equipment, Design design) {
        super(cost);
        this.name = name;
        this.crew = crew;
        this.equipment = equipment;
        this.design = design;
    }

    @Override
    public double getCost() {
        return crew.getCost() + equipment.getCost() + design.getCost();
    }
}
