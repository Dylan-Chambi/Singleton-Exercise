package proxy.exercise;

public class Client {

    public static void main(String[] args) {
        TarjetaDebitoProxy tarjetaDebitoProxy =
                new TarjetaDebitoProxy("Dylan", 1000.00, "4771 4383 0097 4459");

        tarjetaDebitoProxy.pagar(TIPO_MONEDA.DOLARES, 100.00); //-690 Bs.
        tarjetaDebitoProxy.showInfo();
        tarjetaDebitoProxy.pagar(TIPO_MONEDA.EUROS, 10.00); //-72.50 Bs.
        tarjetaDebitoProxy.showInfo();
        tarjetaDebitoProxy.pagar(TIPO_MONEDA.BOLIVIANOS, 250.00); //-250 Bs.
        tarjetaDebitoProxy.showInfo();

        tarjetaDebitoProxy.agregarSaldo(TIPO_MONEDA.PESOS_CHILENOS, 2532.00); //~+20 Bs.
        tarjetaDebitoProxy.showInfo();
        tarjetaDebitoProxy.pagar(TIPO_MONEDA.BOLIVIANOS, 250.00); //-250 Bs.
        tarjetaDebitoProxy.showInfo();
        tarjetaDebitoProxy.pagar(TIPO_MONEDA.BOLIVIANOS, 10.50); //-10.50 Bs.

    }
}
