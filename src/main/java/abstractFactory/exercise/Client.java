package abstractFactory.exercise;

public class Client {
    public static void main(String[] args) {
        Pasajero pasajero = new Pasajero();
        pasajero.setNombre("Carlitos");
        pasajero.setCi("9565625");

        PasajeStandart pasaje1 = (PasajeStandart) FactoryPasaje.make(PasajeType.STANDART);
        pasaje1.setNumeroVuelo("VUELO-1");
        pasaje1.setNumeroAsiento("A-1");
        pasaje1.setPasajero(pasajero);
        pasaje1.showInfo();
    }
}

