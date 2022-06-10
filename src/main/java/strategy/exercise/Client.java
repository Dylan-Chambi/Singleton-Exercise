package strategy.exercise;

public class Client {
    public static void main (String[]args){
        TiendaRopas tiendaRopas = new TiendaRopas();
        tiendaRopas.addRopa(new Ropa("pantalon", 136.0));
        tiendaRopas.addRopa(new Ropa("camisa", 145.0));
        tiendaRopas.addRopa(new Ropa("zapatos", 53.0));
        tiendaRopas.addRopa(new Ropa("abrigo", 99.0));
        tiendaRopas.addRopa(new Ropa("canguro", 1225.0));

        tiendaRopas.setStrategy(new PrimaveraStrategy());
        tiendaRopas.startStrategy();
        tiendaRopas.showPreciosRopas();

        tiendaRopas.setStrategy(new InviernoStrategy());
        tiendaRopas.startStrategy();
        tiendaRopas.showPreciosRopas();

        tiendaRopas.setStrategy(new VeranoStrategy());
        tiendaRopas.startStrategy();
        tiendaRopas.showPreciosRopas();

        tiendaRopas.setStrategy(new OtonioStrategy());
        tiendaRopas.startStrategy();
        tiendaRopas.showPreciosRopas();

    }
}
