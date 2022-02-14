package br.com.henriquellemos.factory;

import br.com.henriquellemos.factory.transport.BikeTransport;
import br.com.henriquellemos.factory.transport.CarTransport;
import br.com.henriquellemos.factory.transport.MotorcycleTransport;
import br.com.henriquellemos.factory.transport.Transport;

class Main {
    private static Transport transport;

    public static void main(String[] args) {
        configure(args[0]);
        if(transport != null) runTransport();
    }

    private static void runTransport() {
        transport.startTransport();
    }

    private static void configure(String arg) {
        switch (arg) {
            case "MOTORCYCLE" -> transport = new MotorcycleTransport();
            case "BIKE" -> transport = new BikeTransport();
            case "CAR" -> transport = new CarTransport();
            default -> System.out.println("Você precisa definir um transporte.");
        }
    }
}