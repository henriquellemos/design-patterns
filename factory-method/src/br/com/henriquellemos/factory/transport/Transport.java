package br.com.henriquellemos.factory.transport;

import br.com.henriquellemos.factory.vehicle.IVehicle;

public abstract class Transport {

    public void startTransport(){
        IVehicle vehicle = createTransport();
        vehicle.startRoute();
    }

    protected abstract IVehicle createTransport();
}
