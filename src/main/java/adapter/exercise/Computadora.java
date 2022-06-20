package adapter.exercise;

public class Computadora implements IArtefactoEletronico {
    private double precio;
    private int tiempoDeVida;

    @Override
    public double precio() {
        return this.precio;
    }

    @Override
    public Computadora setPrecio(double precio) {
        this.precio = precio;
        return this;
    }

    @Override
    public int tiempoDeVida() {
        return this.tiempoDeVida;
    }

    @Override
    public Computadora setTiempoDeVida(int tiempoDeVida) {
        this.tiempoDeVida = tiempoDeVida;
        return this;
    }
}
