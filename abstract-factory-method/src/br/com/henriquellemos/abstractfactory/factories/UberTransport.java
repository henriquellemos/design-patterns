package br.com.henriquellemos.abstractfactory.factories;

import br.com.henriquellemos.abstractfactory.aircraft.Airplane;
import br.com.henriquellemos.abstractfactory.aircraft.IAircraft;
import br.com.henriquellemos.abstractfactory.landvehicle.Car;
import br.com.henriquellemos.abstractfactory.landvehicle.ILandVehicle;

public class UberTransport implements ITransportFactory {
    @Override
    public IAircraft createTransportAircraft() {
        return new Airplane();
    }

    @Override
    public ILandVehicle createTransportLandVehicle() {
        return new Car();
    }
}
