package DesignPatterns.Factory.Decorator;

public class VanillaScoop implements  Icecream {

    Icecream ic;

    public VanillaScoop(Icecream ic){
        this.ic = ic;
    }


    @Override
    public double getCost() {
        return 20 + ic.getCost();
    }

    @Override
    public String getDescription() {
        return "Vanilla Scoop"+ ic.getDescription();
    }
}
