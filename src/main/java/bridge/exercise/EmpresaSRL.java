package bridge.exercise;

public class EmpresaSRL extends EmpresaAbstraction {

    @Override
    public void enviarPaquete(Paquete paquete) {
        double precioEnvio = EmpresaAbstraction.round2(paquete.getPrecio() * metodoEnvioImplementator.descuento());
        System.out.println("Empresa SRL> Enviando mediante " + metodoEnvioImplementator.nombreTipoEnvio() + " el paquete " + paquete.getNombrePaquete() + " a " + paquete.getDestinatario() + " con un costo de " + precioEnvio);
    }
}
