package org.SuperClass;

import java.util.Objects;

public class Design extends HardScapes{
    private Material material;
    private int height;
    private int length;
    private int width;

    public Design(double cost, int length, Material material, int height, int width) {
        super(cost);
        this.length = length;
        this.material = material;
        this.height = height;
        this.width = width;
    }

    public Design(double cost, Design design, int length, Material material, int height, int width) {
        super(cost, design);
        this.length = length;
        this.material = material;
        this.height = height;
        this.width = width;
    }

    public Design(Double cost, Material material, int height, int length, int width) {
        super(cost);
        this.material = material;
        this.height = height;
        this.length = length;
        this.width = width;
    }

    public int sqft() {
        return length * width * height;
    }

    @Override
    public String toString() {
        return "Design{" +
                "cost=" + cost +
                ", material=" + material +
                ", height=" + height +
                ", length=" + length +
                ", width=" + width +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Design design = (Design) o;
        return getHeight() == design.getHeight() && getLength() == design.getLength() && getWidth() == design.getWidth() && Objects.equals(getMaterial(), design.getMaterial());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMaterial(), getHeight(), getLength(), getWidth());
    }

    @Override
    public double getCost() {
        return sqft() * material.getCost();
    }

    public Material getMaterial() {
        return material;
    }

    public int getHeight() {
        return height;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }
}
