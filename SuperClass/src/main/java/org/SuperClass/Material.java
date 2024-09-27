package org.SuperClass;

import java.util.Objects;

public class Material extends HardScapes {
private Block block;
private Paver paver;
private BaseRock baseRock;
private Fabrick fabrick;
private Pipe pipe;
private Addhesive addhesive;

    public Material(double cost, Block block, BaseRock baseRock, Paver paver, Fabrick fabrick, Pipe pipe, Addhesive addhesive) {
        super(cost);
        this.block = block;
        this.baseRock = baseRock;
        this.paver = paver;
        this.fabrick = fabrick;
        this.pipe = pipe;
        this.addhesive = addhesive;
    }

    public Material(double cost, Design design, Block block, BaseRock baseRock, Paver paver, Fabrick fabrick, Pipe pipe, Addhesive addhesive) {
        super(cost, design);
        this.block = block;
        this.baseRock = baseRock;
        this.paver = paver;
        this.fabrick = fabrick;
        this.pipe = pipe;
        this.addhesive = addhesive;
    }

    public Paver getPaver() {
        return paver;
    }

    public void setPaver(Paver paver) {
        this.paver = paver;
    }

    public Block getBlock() {
        return block;
    }

    public void setBlock(Block block) {
        this.block = block;
    }

    public BaseRock getBaseRock() {
        return baseRock;
    }

    public void setBaseRock(BaseRock baseRock) {
        this.baseRock = baseRock;
    }

    public Fabrick getFabrick() {
        return fabrick;
    }

    public void setFabrick(Fabrick fabrick) {
        this.fabrick = fabrick;
    }

    public Pipe getPipe() {
        return pipe;
    }

    public void setPipe(Pipe pipe) {
        this.pipe = pipe;
    }

    public Addhesive getAddhesive() {
        return addhesive;
    }

    public void setAddhesive(Addhesive addhesive) {
        this.addhesive = addhesive;
    }

    @Override
    public double getCost() {
        return block.getCost() + paver.getCost() + baseRock.getCost() + fabrick.getCost() + pipe.getCost() + addhesive.getCost();

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Material material = (Material) o;
        return Objects.equals(getBlock(), material.getBlock()) && Objects.equals(getPaver(), material.getPaver()) && Objects.equals(getBaseRock(), material.getBaseRock()) && Objects.equals(getFabrick(), material.getFabrick()) && Objects.equals(getPipe(), material.getPipe()) && Objects.equals(getAddhesive(), material.getAddhesive());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBlock(), getPaver(), getBaseRock(), getFabrick(), getPipe(), getAddhesive());
    }

    @Override
    public String toString() {
        return "Material{" +
                "block=" + block +
                ", paver=" + paver +
                ", baseRock=" + baseRock +
                ", fabrick=" + fabrick +
                ", pipe=" + pipe +
                ", addhesive=" + addhesive +
                ", cost=" + cost +
                '}';
    }

    public void display() {
        System.out.println(block.toString() + paver.toString() + baseRock.toString() + fabrick.toString() + pipe.toString() + addhesive.toString());
    }
}
