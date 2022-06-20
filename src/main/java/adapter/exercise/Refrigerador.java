package adapter.exercise;

public class Refrigerador implements IDispositivoEletronico {
    private int costo;
    private int tiempoDeGarantia;

    @Override
    public int costo() {
        return this.costo;
    }

    @Override
    public void setCosto(int costo) {
        this.costo = costo;
    }

    @Override
    public int tiempoDeGarantia() {
        return this.tiempoDeGarantia;
    }

    @Override
    public void setTiempoDeGarantia(int tiempoDeGarantia) {
        this.tiempoDeGarantia = tiempoDeGarantia;
    }
}
