package br.com.henriquellemos.abstractfactory.factories;

import br.com.henriquellemos.abstractfactory.aircraft.Helicopter;
import br.com.henriquellemos.abstractfactory.aircraft.IAircraft;
import br.com.henriquellemos.abstractfactory.landvehicle.ILandVehicle;
import br.com.henriquellemos.abstractfactory.landvehicle.Motorcycle;

public class NinetyNineTransport implements ITransportFactory {
    @Override
    public IAircraft createTransportAircraft() {
        return new Helicopter();
    }

    @Override
    public ILandVehicle createTransportLandVehicle() {
        return new Motorcycle();
    }
}
