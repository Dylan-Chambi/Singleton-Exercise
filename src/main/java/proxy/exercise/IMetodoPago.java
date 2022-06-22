package proxy.exercise;

public interface IMetodoPago {
    void pagar(TIPO_MONEDA tipoMoneda, double monto);
    void agregarSaldo(TIPO_MONEDA tipoMoneda, double monto);
}
