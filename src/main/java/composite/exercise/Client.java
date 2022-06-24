package composite.exercise;

public class Client {
    public static void main (String[]args){
        Computadora computadora1 = new Computadora("Computadora 1", 100);
        Computadora computadora2 = new Computadora("Computadora 2", 150);
        Computadora computadora3 = new Computadora("Computadora 3", 320);

        Composite laboratorioCuenta1 = new Composite("Laboratorio de Cuenta 1");
        laboratorioCuenta1.add(computadora1);
        laboratorioCuenta1.add(computadora3);

        Composite laboratorioCuenta2 = new Composite("Laboratorio de Cuenta 2");
        laboratorioCuenta2.add(computadora1);
        laboratorioCuenta2.add(computadora2);
        laboratorioCuenta2.add(computadora3);

        Composite contenedorComputadoras1 = new Composite("Contenedor de Computadoras 1");
        contenedorComputadoras1.add(laboratorioCuenta1);
        contenedorComputadoras1.add(laboratorioCuenta2);

        System.out.println("---------------------Contenedor de Computadoras 1---------------------");
        contenedorComputadoras1.showInfo();

        laboratorioCuenta2.remove(computadora1);

        System.out.println("---------------------Contenedor de Computadoras 1---------------------");
        contenedorComputadoras1.showInfo();
    }
}
