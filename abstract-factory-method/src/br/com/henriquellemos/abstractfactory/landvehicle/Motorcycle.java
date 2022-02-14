package br.com.henriquellemos.abstractfactory.landvehicle;

public class Motorcycle implements ILandVehicle {
    @Override
    public void getCargo() {
        System.out.println("Getting cargo.");
    }

    @Override
    public void startRoute() {
        this.getCargo();
        System.out.println("Motorcycle starting delivery.");
    }
}
