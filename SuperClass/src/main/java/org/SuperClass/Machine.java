package org.SuperClass;

import java.util.Objects;

public class Machine extends Equipment{
    private String name;
    private String operation;
    private int price;

    public Machine(double cost, String name, String operation, int price) {
        super(cost);
        this.name = name;
        this.operation = operation;
        this.price = price;
    }

    public Machine(double cost, HandTool handTools, Machine machines, Truck trucks, String name, String operation, int price) {
        super(cost, handTools, machines, trucks);
        this.name = name;
        this.operation = operation;
        this.price = price;
    }

    public Machine(double cost, Design design, HandTool handTools, Machine machines, Truck trucks, String name, String operation, int price) {
        super(cost, design, handTools, machines, trucks);
        this.name = name;
        this.operation = operation;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public double getCost() {
        switch (name) {
            case "Bob Cat", "Excavator" -> this.cost = 500.0;
            case "Compactor" -> this.cost = 75.0;
        }
        return this.cost;
    }

    @Override
    public String toString() {
        return "Machine{" +
                "name='" + name + '\'' +
                ", operation='" + operation + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Machine machine = (Machine) o;
        return getPrice() == machine.getPrice() && Objects.equals(getName(), machine.getName()) && Objects.equals(getOperation(), machine.getOperation());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getName(), getOperation(), getPrice());
    }
}
