package br.com.henriquellemos.factory.vehicle;

public class Motorcycle implements IVehicle {

    @Override
    public void getCargo() {
        System.out.println("Pegando encomenda.");
    }

    @Override
    public void startRoute() {
        getCargo();
        System.out.println("Iniciando trajeto de moto.");
    }
}
