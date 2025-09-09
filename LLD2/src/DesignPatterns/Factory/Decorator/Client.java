package DesignPatterns.Factory.Decorator;

public class Client {
    public static void main(String[] args) {
        Icecream ic = new OrangeCone();

        ic = new VanillaScoop(ic);

        System.out.println(ic.getCost());
        System.out.println(ic.getDescription());
    }
}
