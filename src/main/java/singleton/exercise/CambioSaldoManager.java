package singleton.exercise;

public class CambioSaldoManager {
    private static CambioSaldoManager instance;

    private CambioSaldoManager(){
        System.out.println("CambioSaldoManger creado");
    }

    private static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        long factor = (long) Math.pow(10, places);
        value = value * factor;
        long tmp = Math.round(value);
        return (double) tmp / factor;
    }

    private synchronized static void multiThreadControl(){
        if(instance==null){
            instance = new CambioSaldoManager();
        }
    }

    public static CambioSaldoManager getInstance(){
        if(instance==null) multiThreadControl();
        return instance;
    }

    public synchronized double cambiarBStoDolar(double cantidad){
        double resultado = round(cantidad * 7, 2);
        System.out.println("Cambio de Bs a Dolar: " + cantidad + " Bs -> " + resultado + " Dolar");
        return resultado;
    }

    public synchronized double cambiarDolarToBS(double cantidad){
        double resultado = round(cantidad / 7, 2);
        System.out.println("Cambio de Dolar a Bs: " + cantidad + " Dolar -> " + resultado + " Bs");
        return resultado;
    }
    public synchronized double cambiarBStoEuro(double cantidad){
        double resultado = round(cantidad * 9, 2);
        System.out.println("Cambio de Bs a Euro: " + cantidad + " Bs -> " + resultado + " Euro");
        return resultado;
    }

    public synchronized double cambiarEuroToBS(double cantidad){
        double resultado = round(cantidad / 9, 2);
        System.out.println("Cambio de Euro a Bs: " + cantidad + " Euro -> " + resultado + " Bs");
        return resultado;
    }
}
