package br.com.henriquellemos.abstractfactory;

import br.com.henriquellemos.abstractfactory.app.Application;
import br.com.henriquellemos.abstractfactory.factories.NinetyNineTransport;
import br.com.henriquellemos.abstractfactory.factories.UberTransport;

public class Main {
    public static void main(String[] args) {
        var app = configure(args[0], args[1]);
        app.startRoute();
    }

    private static Application configure(String company, String transport){
        Application app;

        if ("UBER".equals(company)) {
            app = new Application(new UberTransport(), transport);
        } else {
            app = new Application(new NinetyNineTransport(), transport);
        }
        return app;
    }
}
