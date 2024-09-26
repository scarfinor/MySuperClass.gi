package org.SuperClass;

public class Material extends HardScapes {
private Block block;
private Paver paver;
private BaseRock baseRock;
private Fabrick fabrick;
private Pipe pipe;
private Addhesive addhesive;

    public Paver getPaver() {
        return paver;
    }

    public void setPaver(Paver paver) {
        this.paver = paver;
    }

    public Material(double cost, Block block, Paver paver, BaseRock baseRock, Fabrick fabrick, Pipe pipe, Addhesive addhesive) {
    super(cost);
    this.block = block;
    this.paver = paver;
    this.baseRock = baseRock;
    this.fabrick = fabrick;
    this. pipe = pipe;
    this.addhesive = addhesive;
}


    @Override
    public double getCost() {
        return block.getCost() + paver.getCost() + baseRock.getCost() + fabrick.getCost() + pipe.getCost() + addhesive.getCost();

    }

    public void display() {
        System.out.println(block.toString() + paver.toString() + baseRock.toString() + fabrick.toString() + pipe.toString() + addhesive.toString());
    }
}
