package factoryMethod.exercise;

public abstract class Pasaje {

    private String numeroVuelo;
    private Pasajero pasajero;
    private String numeroAsiento;

    public Pasaje(Pasajero pasajero) {
        this.pasajero = pasajero;
    }

    public abstract void showInfo();

    public String getNumeroVuelo() {
        return numeroVuelo;
    }

    public void setNumeroVuelo(String numeroVuelo) {
        this.numeroVuelo = numeroVuelo;
    }

    public Pasajero getPasajero() {
        return pasajero;
    }

    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
    }

    public String getNumeroAsiento() {
        return numeroAsiento;
    }

    public void setNumeroAsiento(String numeroAsiento) {
        this.numeroAsiento = numeroAsiento;
    }
}
