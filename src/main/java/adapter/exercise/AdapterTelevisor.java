package adapter.exercise;

public class AdapterTelevisor implements IArtefactoEletronico {
    private double diffCosto;
    private Televisor televisor;

    public AdapterTelevisor(Televisor televisor) {
        this.televisor = televisor;
    }

    public Televisor getAdaptee() {
        return televisor;
    }

    public void setAdaptee(Televisor televisor) {
        this.televisor = televisor;
    }

    @Override
    public double precio() {
        return this.televisor.costo() + this.diffCosto;
    }

    @Override
    public AdapterTelevisor setPrecio(double precio) {
        this.televisor.setCosto((int) precio);
        this.diffCosto = precio - this.televisor.costo();
        return this;
    }

    @Override
    public int tiempoDeVida() {
        return this.televisor.tiempoDeGarantia() + 5;
    }

    @Override
    public AdapterTelevisor setTiempoDeVida(int tiempoDeVida) {
        this.televisor.setTiempoDeGarantia(tiempoDeVida-5);
        return this;
    }
}
