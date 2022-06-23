package bridge.exercise;

public abstract class EmpresaAbstraction {
    protected MetodoEnvioImplementator metodoEnvioImplementator;

    public EmpresaAbstraction() {
        this.metodoEnvioImplementator = new MetodoEnvioTierra(); // Por defecto
    }

    public void setMetodoEnvioImplementator(MetodoEnvioImplementator metodoEnvioImplementator) {
        this.metodoEnvioImplementator = metodoEnvioImplementator;
    }

    public abstract void enviarPaquete(Paquete paquete);

    public static double round2(double value) {
        return Math.round(value * 100.0) / 100.0;
    }
}
