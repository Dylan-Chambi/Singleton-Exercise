package bridge.exercise;

public class MetodoEnvioAire implements MetodoEnvioImplementator {
    @Override
    public double descuento() {
        return 1.1;
    }

    @Override
    public String nombreTipoEnvio() {
        return "Aire";
    }
}
