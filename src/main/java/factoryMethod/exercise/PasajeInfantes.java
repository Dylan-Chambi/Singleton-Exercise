package factoryMethod.exercise;

public class PasajeInfantes extends Pasaje {
    private int costoEspecial;

    public PasajeInfantes(Pasajero pasajero) {
        super(pasajero);
    }

    @Override
    public void showInfo() {
        System.out.println("NumeroVuelo: " + getNumeroVuelo());
        System.out.println("Pasajero: " + getPasajero());
        System.out.println("NumeroAsiento: " + getNumeroAsiento());
        System.out.println("CostoEspecial: " + getCostoEspecial());
    }


    public int getCostoEspecial() {
        return costoEspecial;
    }

    public void setCostoEspecial(int costoEspecial) {
        this.costoEspecial = costoEspecial;
    }
}
