package org.SuperClass;

public class HandTool extends Equipment{
    private String name;
    private boolean conditionIsGood;

    public HandTool(double cost, String name, boolean conditionIsGood) {
        super(cost);
        this.name = name;
        this.conditionIsGood = conditionIsGood;
    }

    public HandTool(double cost, HandTool handTools, Machine machines, Truck trucks, String name, boolean conditionIsGood) {
        super(cost, handTools, machines, trucks);
        this.name = name;
        this.conditionIsGood = conditionIsGood;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public HandTool(double cost, String name) {
        super(cost);
        this.name = name;
    }

    public HandTool(double cost, HandTool handTools, Machine machines, Truck trucks, String name) {
        super(cost, handTools, machines, trucks);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isConditionIsGood() {
        return conditionIsGood;
    }

    public void setConditionIsGood(boolean conditionIsGood) {
        this.conditionIsGood = conditionIsGood;
    }
}
