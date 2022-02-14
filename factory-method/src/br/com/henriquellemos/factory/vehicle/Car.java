package br.com.henriquellemos.factory.vehicle;

public class Car implements IVehicle {

    @Override
    public void getCargo() {
        System.out.println("Pegando passageiro.");
    }

    @Override
    public void startRoute() {
        getCargo();
        System.out.println("Iniciando rota!");
    }

}
