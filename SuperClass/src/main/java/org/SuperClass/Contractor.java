package org.SuperClass;

import java.util.ArrayList;
import java.util.Objects;

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

    public Contractor(double cost, Design design, String name, Crew crew, Equipment equipment, Design design1) {
        super(cost, design);
        this.name = name;
        this.crew = crew;
        this.equipment = equipment;
        this.design = design1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Crew getCrew() {
        return crew;
    }

    public void setCrew(Crew crew) {
        this.crew = crew;
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }

    public Design getDesign() {
        return design;
    }

    public void setDesign(Design design) {
        this.design = design;
    }

    @Override
    public String toString() {
        return "Contractor{" +
                "name='" + name + '\'' +
                ", crew=" + crew +
                ", equipment=" + equipment +
                ", design=" + design +
                ", cost=" + cost +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contractor that = (Contractor) o;
        return Objects.equals(getName(), that.getName()) && Objects.equals(getCrew(), that.getCrew()) && Objects.equals(getEquipment(), that.getEquipment()) && Objects.equals(getDesign(), that.getDesign());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getCrew(), getEquipment(), getDesign());
    }

    @Override
    public double getCost() {
        return crew.getCost() + equipment.getCost() + design.getCost();
    }
}
