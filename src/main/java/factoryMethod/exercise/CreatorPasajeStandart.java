package factoryMethod.exercise;

public class CreatorPasajeStandart extends Creator {

    @Override
    public PasajeStandart FactoryMethodPasaje() {
        Pasajero pasajero = new Pasajero();
        pasajero.setNombre("Juan");
        pasajero.setCi("123456789");
        PasajeStandart pasajeStandart = new PasajeStandart(pasajero);
        pasajeStandart.setNumeroVuelo("Vuelo 1");
        pasajeStandart.setPasajero(pasajero);
        pasajeStandart.setNumeroAsiento("A1");
        pasajeStandart.setCostoPasaje(1000);
        return pasajeStandart;
    }
}

