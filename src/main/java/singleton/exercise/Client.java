package singleton.exercise;

public class Client {

        public static void main(String[] args) {

            LibreCambistas libreCambistas = new LibreCambistas("Juan");
            Banco banco = new Banco("Banco Union");
            CasaDeCambios casaDeCambios = new CasaDeCambios("Quick Exchange");


            Thread hilo1 = new Thread(new Runnable() {
                @Override
                public void run() {
                    libreCambistas.cambiarDineroBStoDolar(100);
                }
            });

            Thread hilo2 = new Thread(new Runnable() {
                @Override
                public void run() {
                    banco.cambiarDineroDolarToBS(350);
                }
            });

            Thread hilo3 = new Thread(new Runnable() {
                @Override
                public void run() {
                    casaDeCambios.cambiarDineroBStoEuro(150);
                }
            });

            Thread hilo4 = new Thread(new Runnable() {
                @Override
                public void run() {
                    libreCambistas.cambiarDineroDolarToBS(1050);
                }
            });

            Thread hilo5 = new Thread(new Runnable() {
                @Override
                public void run() {
                    libreCambistas.cambiarDineroBStoDolar(34);
                }
            });

            hilo1.start();
            hilo2.start();
            hilo3.start();
            hilo4.start();
            hilo5.start();
        }
}
