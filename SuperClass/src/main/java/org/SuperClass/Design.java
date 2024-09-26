package org.SuperClass;

public class Design extends HardScapes{
    private Material material;
    private int height;
    private int length;
    private int width;

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
