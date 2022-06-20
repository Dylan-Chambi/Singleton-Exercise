package adapter.exercise;

public class AdapteeRefrigerador implements IArtefactoEletronico {
    private double diffCosto;
    private Refrigerador refrigerador;

    public AdapteeRefrigerador(Refrigerador refrigerador) {
        this.refrigerador = refrigerador;
    }

    public Refrigerador getAdaptee() {
        return refrigerador;
    }

    public void setAdaptee(Refrigerador lavadora) {
        this.refrigerador = lavadora;
    }

    @Override
    public double precio() {
        return this.refrigerador.costo() + this.diffCosto;
    }

    @Override
    public AdapteeRefrigerador setPrecio(double precio) {
        this.refrigerador.setCosto((int) precio);
        this.diffCosto = precio - this.refrigerador.costo();
        return this;
    }

    @Override
    public int tiempoDeVida() {
        return this.refrigerador.tiempoDeGarantia() + 5;
    }

    @Override
    public AdapteeRefrigerador setTiempoDeVida(int tiempoDeVida) {
        this.refrigerador.setTiempoDeGarantia(tiempoDeVida-5);
        return this;
    }
}
