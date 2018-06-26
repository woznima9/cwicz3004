package mwproby;

import javax.jws.Oneway;

public class Cechy implements Cechowosc {
    @Override
    public void odglos() {

    }

    @Override
    public void poruszanie() {

    }

    public static void main(String[] args) {
        Cechowosc kaczki = new Kaczka();
        Cechowosc konia = new Kon();
        kaczki.odglos();
        konia.odglos();
    }
}
