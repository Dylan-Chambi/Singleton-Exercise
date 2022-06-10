package strategy.exercise;

public class Ropa {
    private String tipo;
    private double precio;

    private double precioDescuento;

    public Ropa(String tipo, double precio) {
        this.tipo = tipo;
        this.precio = precio;
        this.precioDescuento = precio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public double getPrecioDescuento() {
        return precioDescuento;
    }

    public void setPrecioDescuento(double precioDescuento) {
        this.precioDescuento = round(precioDescuento, 2);
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }


    public static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        long factor = (long) Math.pow(10, places);
        value = value * factor;
        long tmp = Math.round(value);
        return (double) tmp / factor;
    }
}
