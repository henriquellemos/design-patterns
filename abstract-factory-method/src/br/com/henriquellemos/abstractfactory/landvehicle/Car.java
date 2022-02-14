package br.com.henriquellemos.abstractfactory.landvehicle;

public class Car implements ILandVehicle {

    @Override
    public void getCargo() {
        System.out.println("Getting passangers.");
    }

    @Override
    public void startRoute() {
        this.getCargo();
        System.out.println("Car starting route.");
    }
}
