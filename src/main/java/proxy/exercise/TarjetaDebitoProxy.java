package proxy.exercise;


public class TarjetaDebitoProxy implements IMetodoPago {
    private TarjetaDebito tarjetaDebito;

    public TarjetaDebitoProxy(String titular, double montoDisponibleBolivianos, String numeroTarjeta) {
        tarjetaDebito = new TarjetaDebito(titular, montoDisponibleBolivianos, numeroTarjeta);
    }

    @Override
    public void pagar(TIPO_MONEDA tipoMoneda, double monto) {
        if(monto <= 0){
            System.out.println("ERROR AL PAGAR> El monto debe ser mayor a 0");
            return;
        }
        double montoConvertido = convertirMonto(tipoMoneda, monto);
        if(montoConvertido > tarjetaDebito.getSaldoDisponibleBolivianos()){
            System.out.println("ERROR AL PAGAR> El monto es mayor al disponible");
            return;
        }
        tarjetaDebito.pagar(tipoMoneda, montoConvertido);
    }

    @Override
    public void agregarSaldo(TIPO_MONEDA tipoMoneda, double monto) {
        if(monto <= 0){
            System.out.println("ERROR AL AGREGAR SALDO> El monto debe ser mayor a 0");
            return;
        }
        double montoConvertido = convertirMonto(tipoMoneda, monto);
        tarjetaDebito.agregarSaldo(tipoMoneda, montoConvertido);
    }

    public double convertirMonto(TIPO_MONEDA tipoMoneda, double monto){
        return redondear(monto * switch (tipoMoneda) {
            case BOLIVIANOS -> 1;
            case DOLARES -> 6.90;
            case EUROS -> 7.25;
            case PESOS_CHILENOS -> 0.0079;
        });
    }

    public double redondear(double numero){
        return Math.round(numero * 100.0) / 100.0;
    }
    public void showInfo(){
        System.out.println("----------------------------------------------------");
        System.out.println("Titular: " + tarjetaDebito.getTitular());
        System.out.println("Saldo disponible: " + tarjetaDebito.getSaldoDisponibleBolivianos() + " Bs.");
        System.out.println("Numero de tarjeta: " + tarjetaDebito.getNumeroTarjeta());
        System.out.println("-----------------------------------------------------");
    }

    public String getTitular() {
        return tarjetaDebito.getTitular();
    }
    public String getNumeroTarjeta() {
        return tarjetaDebito.getNumeroTarjeta();
    }
    public double getMontoDisponibleBolivianos() {
        return tarjetaDebito.getSaldoDisponibleBolivianos();
    }
}
