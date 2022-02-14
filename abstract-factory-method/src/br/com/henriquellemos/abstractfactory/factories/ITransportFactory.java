package br.com.henriquellemos.abstractfactory.factories;

import br.com.henriquellemos.abstractfactory.aircraft.IAircraft;
import br.com.henriquellemos.abstractfactory.landvehicle.ILandVehicle;

public interface ITransportFactory {
    IAircraft createTransportAircraft();
    ILandVehicle createTransportLandVehicle();
}
