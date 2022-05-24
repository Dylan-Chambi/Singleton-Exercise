package factoryMethod.exercise;

public class CreatorPasajeSolidario extends Creator {

    @Override
    public PasajeSolidario FactoryMethodPasaje() {
        Pasajero pasajero = new Pasajero();
        pasajero.setNombre("Carlos");
        pasajero.setCi("123456789");
        PasajeSolidario pasajeSolidario = new PasajeSolidario(pasajero);
        pasajeSolidario.setNumeroVuelo("Vuelo 1");
        pasajeSolidario.setPasajero(pasajero);
        pasajeSolidario.setNumeroAsiento("A1");
        pasajeSolidario.setCostoPasaje(1000);
        pasajeSolidario.setDescuento("10%");
        return pasajeSolidario;
    }
}

