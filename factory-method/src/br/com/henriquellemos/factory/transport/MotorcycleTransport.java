package br.com.henriquellemos.factory.transport;

import br.com.henriquellemos.factory.vehicle.IVehicle;
import br.com.henriquellemos.factory.vehicle.Motorcycle;

public class MotorcycleTransport extends Transport {
    @Override
    protected IVehicle createTransport() {
        return new Motorcycle();
    }
}
