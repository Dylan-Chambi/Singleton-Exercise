package adapter.exercise;

public class Celular implements IArtefactoEletronico {
    private double precio;
    private int tiempoDeVida;

    @Override
    public double precio() {
        return this.precio;
    }

    @Override
    public Celular setPrecio(double precio) {
        this.precio = precio;
        return this;
    }

    @Override
    public int tiempoDeVida() {
        return this.tiempoDeVida;
    }

    @Override
    public Celular setTiempoDeVida(int tiempoDeVida) {
        this.tiempoDeVida = tiempoDeVida;
        return this;
    }
}
