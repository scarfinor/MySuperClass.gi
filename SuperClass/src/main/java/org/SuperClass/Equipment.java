package org.SuperClass;

import java.util.List;

public class Equipment extends HardScapes{
    private List<HandTool> handTools;
    private List<Machine> machines;
    private List<Truck> trucks;

    public Equipment(double cost) {
        super(cost);
    }

    public Equipment(double cost, List<HandTool> handTools, List<Machine> machines, List<Truck> trucks) {
        super(cost);
        this.handTools = handTools;
        this.machines = machines;
        this.trucks = trucks;
    }

    @Override
    public double getCost() {
        return ;
    }
}
