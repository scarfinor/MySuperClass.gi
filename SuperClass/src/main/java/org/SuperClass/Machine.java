package org.SuperClass;

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

    @Override
    public double getCost() {
        switch (name) {
            case "Bob Cat", "Excavator" -> this.cost = 500.0;
            case "Compactor" -> this.cost = 75.0;
        }
        return this.cost;
    }
}
