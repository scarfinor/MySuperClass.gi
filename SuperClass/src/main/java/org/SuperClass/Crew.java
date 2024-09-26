package org.SuperClass;

public class Crew extends Contractor{
    private int age;
    private String job;
    private int wage;
    private Material material;

    public Crew(Double cost, String name, int age, String job, int wage, Material material) {
        super(cost,name);
        this.age = age;
        this.job = job;
        this.wage = wage;
        this.material = material;
    }
    public void work() {
        switch (job) {
            case "Base" -> this.name + "sets the base blocks";
            case "Prep" -> this.name + "preps the trench with rock and compacts it.";
            case "Laborer" -> this.name + "brings the " + material.display() + "and digs a trench";
        }
    }
    @Override
    public double getCost() {
        return wage * 40;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
