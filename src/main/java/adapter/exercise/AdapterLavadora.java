package adapter.exercise;

public class AdapterLavadora implements IArtefactoEletronico {
    private double diffCosto;
    private Lavadora lavadora;

    public AdapterLavadora(Lavadora lavadora) {
        this.lavadora = lavadora;
    }

    public Lavadora getAdaptee() {
        return lavadora;
    }

    public void setAdaptee(Lavadora lavadora) {
        this.lavadora = lavadora;
    }

    @Override
    public double precio() {
        return this.lavadora.costo() + this.diffCosto;
    }

    @Override
    public AdapterLavadora setPrecio(double precio) {
        this.lavadora.setCosto((int) precio);
        this.diffCosto = precio - this.lavadora.costo();
        return this;
    }

    @Override
    public int tiempoDeVida() {
        return this.lavadora.tiempoDeGarantia() + 5;
    }

    @Override
    public AdapterLavadora setTiempoDeVida(int tiempoDeVida) {
        this.lavadora.setTiempoDeGarantia(tiempoDeVida-5);
        return this;
    }
}
