package br.com.henriquellemos.abstractfactory.aircraft;

public class Helicopter implements IAircraft {
    @Override
    public void getCargo() {
        System.out.println("Getting cargo.");
    }

    @Override
    public void startRoute() {
        this.wind();
        this.getCargo();
        System.out.println("Helicopter starting to fly.");
    }

    @Override
    public void wind() {
        System.out.println("Winds are at 25km/h. Safe to fly.");
    }
}
