package factoryMethod.exercise;

public class PasajeSolidario extends Pasaje {

    private int costoPasaje;
    private String descuento;

    public PasajeSolidario(Pasajero pasajero) {
        super(pasajero);
    }

    public int getCostoPasaje() {
        return costoPasaje;
    }

    public void setCostoPasaje(int costoPasaje) {
        this.costoPasaje = costoPasaje;
    }

    public String getDescuento() {
        return descuento;
    }

    public void setDescuento(String descuento) {
        this.descuento = descuento;
    }

    @Override
    public void showInfo() {
        //toString
        System.out.println("NumeroVuelo: " + getNumeroVuelo());
        System.out.println("Pasajero: " + getPasajero());
        System.out.println("NumeroAsiento: " + getNumeroAsiento());
        System.out.println("CostoPasaje: " + getCostoPasaje());
        System.out.println("Descuento: " + getDescuento());
    }


}

