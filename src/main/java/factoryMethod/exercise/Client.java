package factoryMethod.exercise;

public class Client {
    public static void main(String[] args) {
        PasajeSolidario pasajeSolidario1 = new CreatorPasajeSolidario().FactoryMethodPasaje();
        pasajeSolidario1.showInfo();

        PasajeSolidario pasajeSolidario2 = new CreatorPasajeSolidario().FactoryMethodPasaje();
        pasajeSolidario2.showInfo();

        PasajeStandart pasajeStandart = new CreatorPasajeStandart().FactoryMethodPasaje();
        pasajeStandart.showInfo();

        PasajeStandart pasajeStandart2 = new CreatorPasajeStandart().FactoryMethodPasaje();
        pasajeStandart2.showInfo();

        PasajeInfantes pasajeInfantes = new CreatorPasajeInfantes().FactoryMethodPasaje();
        pasajeInfantes.showInfo();

        PasajeInfantes pasajeInfantes2 = new CreatorPasajeInfantes().FactoryMethodPasaje();
        pasajeInfantes2.showInfo();

    }
}