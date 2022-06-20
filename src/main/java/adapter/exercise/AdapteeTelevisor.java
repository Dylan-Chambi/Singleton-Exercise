package adapter.exercise;

public class AdapteeTelevisor implements IArtefactoEletronico {
    private double diffCosto;
    private Televisor televisor;

    public AdapteeTelevisor(Televisor televisor) {
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
    public AdapteeTelevisor setPrecio(double precio) {
        this.televisor.setCosto((int) precio);
        this.diffCosto = precio - this.televisor.costo();
        return this;
    }

    @Override
    public int tiempoDeVida() {
        return this.televisor.tiempoDeGarantia() + 5;
    }

    @Override
    public AdapteeTelevisor setTiempoDeVida(int tiempoDeVida) {
        this.televisor.setTiempoDeGarantia(tiempoDeVida-5);
        return this;
    }
}
