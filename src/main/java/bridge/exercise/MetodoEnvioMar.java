package bridge.exercise;

public class MetodoEnvioMar implements MetodoEnvioImplementator {
    @Override
    public double descuento() {
        return 1.5;
    }

    @Override
    public String nombreTipoEnvio() {
        return "Mar";
    }
}
