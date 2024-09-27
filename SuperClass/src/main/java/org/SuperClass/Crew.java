package org.SuperClass;

import java.util.Objects;

public class Crew extends Contractor{
    private int age;
    private String job;
    private int wage;
    private Material material;

    public Crew(double cost, String name, int age, String job, int wage, Material material) {
        super(cost, name);
        this.age = age;
        this.job = job;
        this.wage = wage;
        this.material = material;
    }

    public Crew(double cost, String name, Crew crew, Equipment equipment, Design design, int age, String job, int wage, Material material) {
        super(cost, name, crew, equipment, design);
        this.age = age;
        this.job = job;
        this.wage = wage;
        this.material = material;
    }

    public Crew(Double cost, String name, int age, String job, int wage, Material material) {
        super(cost,name);
        this.age = age;
        this.job = job;
        this.wage = wage;
        this.material = material;
    }

    @Override
    public String toString() {
        return "Crew{" +
                "age=" + age +
                ", job='" + job + '\'' +
                ", wage=" + wage +
                ", material=" + material +
                ", name='" + name + '\'' +
                ", cost=" + cost +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Crew crew = (Crew) o;
        return getAge() == crew.getAge() && getWage() == crew.getWage() && Objects.equals(getJob(), crew.getJob()) && Objects.equals(getMaterial(), crew.getMaterial());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAge(), getJob(), getWage(), getMaterial());
    }

    public int getWage() {
        return wage;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
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
