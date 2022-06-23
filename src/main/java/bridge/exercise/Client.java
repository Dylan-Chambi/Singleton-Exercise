package bridge.exercise;

public class Client {

    public static void main (String[]args){
        MetodoEnvioAire metodoEnvioAire = new MetodoEnvioAire();
        MetodoEnvioTierra metodoEnvioTierra = new MetodoEnvioTierra();

        Paquete paquete = new Paquete().setNombrePaquete("Paquete 1").setPeso(3.5).setPrecio(100.0).setRemitente("Marton").setDestinatario("Hector");

        System.out.println("--------------------Metodos de envio de inicio--------------------");
        EmpresaSRL empresaSRL = new EmpresaSRL();
        empresaSRL.setMetodoEnvioImplementator(metodoEnvioTierra);
        empresaSRL.enviarPaquete(paquete);
        empresaSRL.setMetodoEnvioImplementator(metodoEnvioAire);
        empresaSRL.enviarPaquete(paquete);

        EmpresaSA empresaSA = new EmpresaSA();
        empresaSA.setMetodoEnvioImplementator(metodoEnvioTierra);
        empresaSA.enviarPaquete(paquete);
        empresaSA.setMetodoEnvioImplementator(metodoEnvioAire);
        empresaSA.enviarPaquete(paquete);


        System.out.println("--------------------Metodos de envio añadidos despues--------------------");
        MetodoEnvioMar metodoEnvioMar = new MetodoEnvioMar();
        empresaSRL.setMetodoEnvioImplementator(metodoEnvioMar);
        empresaSRL.enviarPaquete(paquete);
        empresaSA.setMetodoEnvioImplementator(metodoEnvioMar);
        empresaSA.enviarPaquete(paquete);

    }
}
