package proxy.exercise;

public class TarjetaDebito implements IMetodoPago {
    private String titular;
    private double saldoDisponibleBolivianos;
    private String numeroTarjeta;


    public TarjetaDebito(String titular, double saldoDisponibleBolivianos, String numeroTarjeta) {
        this.titular = titular;
        this.saldoDisponibleBolivianos = saldoDisponibleBolivianos;
        this.numeroTarjeta = numeroTarjeta;
    }

    @Override
    public void pagar(TIPO_MONEDA tipoMoneda, double monto) {
        saldoDisponibleBolivianos -= monto;
    }

    @Override
    public void agregarSaldo(TIPO_MONEDA tipoMoneda, double monto) {
        saldoDisponibleBolivianos += monto;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldoDisponibleBolivianos() {
        return saldoDisponibleBolivianos;
    }

    public void setSaldoDisponibleBolivianos(double saldoDisponibleBolivianos) {
        this.saldoDisponibleBolivianos = saldoDisponibleBolivianos;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }
}
