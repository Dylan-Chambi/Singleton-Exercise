package bridge.exercise;

public class EmpresaSA extends EmpresaAbstraction {

    @Override
    public void enviarPaquete(Paquete paquete) {
        double precioEnvio = EmpresaAbstraction.round2(paquete.getPrecio() * metodoEnvioImplementator.descuento());
        System.out.println("Empresa SA> Enviando mediante " + metodoEnvioImplementator.nombreTipoEnvio() + " el paquete " + paquete.getNombrePaquete() + " a " + paquete.getDestinatario() + " con un costo de " + precioEnvio);
    }
}
