package br.com.henriquellemos.factory.transport;


import br.com.henriquellemos.factory.vehicle.Car;
import br.com.henriquellemos.factory.vehicle.IVehicle;

public class CarTransport extends Transport {
    @Override
    protected IVehicle createTransport() {
        return new Car();
    }
}
