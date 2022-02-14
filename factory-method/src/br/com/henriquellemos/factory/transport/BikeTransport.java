package br.com.henriquellemos.factory.transport;


import br.com.henriquellemos.factory.vehicle.Bike;
import br.com.henriquellemos.factory.vehicle.IVehicle;

public class BikeTransport extends Transport{
    @Override
    protected IVehicle createTransport() {
        return new Bike();
    }
}
