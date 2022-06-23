package bridge.exercise;

public class MetodoEnvioTierra implements MetodoEnvioImplementator {
    @Override
    public double descuento() {
        return 1.05;
    }

    @Override
    public String nombreTipoEnvio() {
        return "Tierra";
    }
}
