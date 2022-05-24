package factoryMethod.exercise;

public class PasajeStandart extends Pasaje {

    private int costoPasaje;

    public PasajeStandart(Pasajero pasajero) {
        super(pasajero);
    }

    @Override
    public void showInfo() {
        System.out.println("NumeroVuelo: " + getNumeroVuelo());
        System.out.println("Pasajero: " + getPasajero());
        System.out.println("NumeroAsiento: " + getNumeroAsiento());
        System.out.println("CostoPasaje: " + getCostoPasaje());
    }

    public int getCostoPasaje() {
        return costoPasaje;
    }

    public void setCostoPasaje(int costoPasaje) {
        this.costoPasaje = costoPasaje;
    }
}
