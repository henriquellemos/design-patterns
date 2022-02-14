package br.com.henriquellemos.factory.vehicle;

public class Bike implements IVehicle {
    @Override
    public void getCargo() {
        System.out.println("Pegando encomenda.");
    }

    @Override
    public void startRoute() {
        getCargo();
        System.out.println("Iniciando entrega de bike.");
    }
}
