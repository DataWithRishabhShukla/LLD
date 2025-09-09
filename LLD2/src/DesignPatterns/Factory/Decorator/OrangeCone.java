package DesignPatterns.Factory.Decorator;

public class OrangeCone implements  Icecream {

    Icecream ic;

    public  OrangeCone(){}

    public OrangeCone(Icecream ic){
        this.ic = ic;
    }

    @Override
    public double getCost() {
        if(ic == null)
            return 10;

        return 10+ ic.getCost();
    }

    @Override
    public String getDescription() {
        if(ic == null)
            return "Orange cone";

        return "Orange cone"+ ic.getDescription();
    }
}
