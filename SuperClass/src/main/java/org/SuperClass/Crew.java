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
    public String work() {
        String a;
        String b;

        switch (job) {
            case "Base" -> {
                a = "sets the base";
                return name + a;
            }
            case "Prep" -> {
                a = "preps the trench with rock and compacts it.";
                return name + a;
            }
            case "Laborer" -> {
                a = "brings the ";
                b = " and digs a trench";
                return name + a + material.toString() + b;
            }
        }
        return null;
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
