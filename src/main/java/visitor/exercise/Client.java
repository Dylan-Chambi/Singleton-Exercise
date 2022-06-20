package visitor.exercise;

public class Client {

    public static void main(String[]args){
        Librecambista librecambista = new Librecambista();

        //Paises como singleton con enum
        Bolivia bolivia = Bolivia.paisInstance;
        Argentina argentina = Argentina.paisInstance;
        Brasil brasil = Brasil.paisInstance;
        Italia italia = Italia.paisInstance;

        double montoEnDolares = 30.20;

        System.out.println("--------------------- Visitor - Bolivia ---------------------");
        double montoEnBolivianos = 69.00;
        double cambioADolares = bolivia.cambioMonedaLocalADolar(librecambista).apply(montoEnBolivianos);
        System.out.println("Cambio de " + montoEnBolivianos + " Bolivianos a Dolares: " + cambioADolares);
        double cambioABolivianos = bolivia.cambioDolarAMonedaLocal(librecambista).apply(montoEnDolares);
        System.out.println("Cambio de " + montoEnDolares + " Dolares a Bolivianos: " + cambioABolivianos);

        System.out.println("--------------------- Visitor - Argentina ---------------------");
        double montoEnPesosArgentinos = 96.20;
        cambioADolares = argentina.cambioMonedaLocalADolar(librecambista).apply(montoEnPesosArgentinos);
        System.out.println("Cambio de " + montoEnPesosArgentinos + " Pesos Argentinos a Dolares: " + cambioADolares);
        double cambioAPesosArgentinos = argentina.cambioDolarAMonedaLocal(librecambista).apply(montoEnDolares);
        System.out.println("Cambio de " + montoEnDolares + " Dolares a Pesos Argentinos: " + cambioAPesosArgentinos);

        System.out.println("--------------------- Visitor - Brasil ---------------------");
        double montoEnReales = 20.86;
        cambioADolares = brasil.cambioMonedaLocalADolar(librecambista).apply(montoEnReales);
        System.out.println("Cambio de " + montoEnReales + " Reales Brasileños a Dolares: " + cambioADolares);
        double cambioAReales = brasil.cambioDolarAMonedaLocal(librecambista).apply(montoEnDolares);
        System.out.println("Cambio de " + montoEnDolares + " Dolares a Reales Brasileños: " + cambioAReales);

        System.out.println("--------------------- Visitor - Italia ---------------------");
        double montoEnEuros = 10.20;
        cambioADolares = italia.cambioMonedaLocalADolar(librecambista).apply(montoEnEuros);
        System.out.println("Cambio de " + montoEnEuros + " Euros a Dolares: " + cambioADolares);
        double cambioAEuros = italia.cambioDolarAMonedaLocal(librecambista).apply(montoEnDolares);
        System.out.println("Cambio de " + montoEnDolares + " Dolares a Euros: " + cambioAEuros);

    }
}
