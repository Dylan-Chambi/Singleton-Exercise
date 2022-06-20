package adapter.exercise;

public class Client {

    public static void main (String [] args){
        Celular celular = new Celular().setPrecio(149.99).setTiempoDeVida(5);
        Tablet tablet = new Tablet().setPrecio(319.99).setTiempoDeVida(5);
        Computadora computadora = new Computadora().setPrecio(499.99).setTiempoDeVida(10);

        AdapterTelevisor televisor = new AdapterTelevisor(new Televisor()).setPrecio(349.99).setTiempoDeVida(10);
        AdapterLavadora lavadora = new AdapterLavadora(new Lavadora()).setPrecio(179.99).setTiempoDeVida(12);
        AdapterRefrigerador refrigerador = new AdapterRefrigerador(new Refrigerador()).setPrecio(139.99).setTiempoDeVida(5);

        System.out.println("--------------------Artefactos Electricos--------------------");
        System.out.println(" - Celular : { " + "precio: " + celular.precio() + ", tiempoDeVida: " + celular.tiempoDeVida() + " }");
        System.out.println(" - Tablet : { " + "precio: " + tablet.precio() + ", tiempoDeVida: " + tablet.tiempoDeVida() + " }");
        System.out.println(" - Computadora : { " + "precio: " + computadora.precio() + ", tiempoDeVida: " + computadora.tiempoDeVida() + " }");
        System.out.println("--------------------Dispositivos Electricos (Adapatados)--------------------");
        System.out.println(" - Televisor : { " + "precio: " + televisor.precio() + ", tiempoDeVida: " + televisor.tiempoDeVida() + " }");
        System.out.println(" - Lavadora : { " + "precio: " + lavadora.precio() + ", tiempoDeVida: " + lavadora.tiempoDeVida() + " }");
        System.out.println(" - Refrigerador : { " + "precio: " + refrigerador.precio() + ", tiempoDeVida: " + refrigerador.tiempoDeVida() + " }");

    }

}
