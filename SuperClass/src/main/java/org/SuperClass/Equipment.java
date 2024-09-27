package org.SuperClass;

import java.util.List;
import java.util.Objects;

public class Equipment extends HardScapes{
    private HandTool handTools;
    private Machine machines;
    private Truck trucks;

    public Equipment(double cost) {
        super(cost);
    }

    public Equipment(double cost, HandTool handTools, Machine machines, Truck trucks) {
        super(cost);
        this.handTools = handTools;
        this.machines = machines;
        this.trucks = trucks;
    }

    public Equipment(double cost, Design design, HandTool handTools, Machine machines, Truck trucks) {
        super(cost, design);
        this.handTools = handTools;
        this.machines = machines;
        this.trucks = trucks;
    }

    public HandTool getHandTools() {
        return handTools;
    }

    public void setHandTools(HandTool handTools) {
        this.handTools = handTools;
    }

    public Machine getMachines() {
        return machines;
    }

    public void setMachines(Machine machines) {
        this.machines = machines;
    }

    public Truck getTrucks() {
        return trucks;
    }

    public void setTrucks(Truck trucks) {
        this.trucks = trucks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Equipment equipment = (Equipment) o;
        return Objects.equals(getHandTools(), equipment.getHandTools()) && Objects.equals(getMachines(), equipment.getMachines()) && Objects.equals(getTrucks(), equipment.getTrucks());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getHandTools(), getMachines(), getTrucks());
    }

    @Override
    public double getCost() {
        return machines.getCost() + trucks.getCost();
    }
}
