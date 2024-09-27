package org.SuperClass;

public abstract class HardScapes {
    double cost;
    private Design design;

    public HardScapes(double cost) {
        this.cost = cost;
    }

    public HardScapes(double cost, Design design) {
        this.cost = cost;
        this.design = design;
    }

    public abstract double getCost();
}

