package composite.exercise;

public class Computadora implements Component{
    private double precioVenta;
    private String leafName;

    public Computadora(String leafName, double precioVenta) {
        this.leafName = leafName;
        this.precioVenta = precioVenta;
    }

    public Computadora setLeafName(String leafName) {
        this.leafName = leafName;
        return this;
    }

    public String getLeafName() {
        return leafName;
    }

    @Override
    public double getPrecioVenta() {
        return this.precioVenta;
    }

    @Override
    public String getInfo() {
        return this.leafName + " > precioVenta: " + this.getPrecioVenta();
    }

    @Override
    public void showInfo() {
        System.out.println(this.getInfo());
    }
}
