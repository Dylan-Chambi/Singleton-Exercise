package adapter.exercise;

public class Tablet implements IArtefactoEletronico {
    private double precio;
    private int tiempoDeVida;

    @Override
    public double precio() {
        return this.precio;
    }

    @Override
    public Tablet setPrecio(double precio) {
        this.precio = precio;
        return this;
    }

    @Override
    public int tiempoDeVida() {
        return this.tiempoDeVida;
    }

    @Override
    public Tablet setTiempoDeVida(int tiempoDeVida) {
        this.tiempoDeVida = tiempoDeVida;
        return this;
    }
}
