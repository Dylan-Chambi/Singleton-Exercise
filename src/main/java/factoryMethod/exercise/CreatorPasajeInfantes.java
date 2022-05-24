package factoryMethod.exercise;

public class CreatorPasajeInfantes extends Creator {

    @Override
    public PasajeInfantes FactoryMethodPasaje() {
        Pasajero pasajero = new Pasajero();
        pasajero.setNombre("Juan");
        pasajero.setCi("123456789");
        pasajero.setFechaNacimiento("23/01/2017");
        PasajeInfantes pasajeInfantes = new PasajeInfantes(pasajero);
        pasajeInfantes.setNumeroVuelo("Vuelo 1");
        pasajeInfantes.setPasajero(pasajero);
        pasajeInfantes.setNumeroAsiento("A1");
        pasajeInfantes.setCostoEspecial(600);
        return pasajeInfantes;
    }
}

