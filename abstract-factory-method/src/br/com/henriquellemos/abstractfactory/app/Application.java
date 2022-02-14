package br.com.henriquellemos.abstractfactory.app;

import br.com.henriquellemos.abstractfactory.aircraft.IAircraft;
import br.com.henriquellemos.abstractfactory.factories.ITransportFactory;
import br.com.henriquellemos.abstractfactory.landvehicle.ILandVehicle;

public class Application {

    private IAircraft aircraft;
    private ILandVehicle vehicle;

    public Application(ITransportFactory factory, String transportType){
        if(transportType.equalsIgnoreCase("LAND")){
            vehicle = factory.createTransportLandVehicle();
        } else {
            aircraft = factory.createTransportAircraft();
        }
    }

    public void startRoute(){
        if(vehicle != null){
            vehicle.startRoute();
        } else aircraft.startRoute();
    }
}
