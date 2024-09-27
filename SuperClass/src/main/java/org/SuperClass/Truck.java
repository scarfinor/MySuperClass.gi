package org.SuperClass;

import java.util.Objects;

public class Truck extends Equipment{
    String name;

    public Truck(double cost, String name) {
        super(cost);
        this.name = name;
    }

    public Truck(double cost, HandTool handTools, Machine machines, Truck trucks, String name) {
        super(cost, handTools, machines, trucks);
        this.name = name;
    }

    public Truck(double cost, Design design, HandTool handTools, Machine machines, Truck trucks, String name) {
        super(cost, design, handTools, machines, trucks);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Truck truck = (Truck) o;
        return Objects.equals(getName(), truck.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getName());
    }

    @Override
    public String toString() {
        return "Truck{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                '}';
    }

    @Override
    public double getCost() {
        switch (name) {
            case "Chevy 2500 HD", "Ford Power Stroke" -> this.cost = 500.0;
            case "Chevy 1500", "Ford F150" -> this.cost = 250.0;
        }
        return this.cost;
    }
}
