package strategy.exercise;

import java.util.List;

public class InviernoStrategy implements IStrategy{
    private static double cambioPrecio = 0.9;
    @Override
    public void startStrategy(TiendaRopas tiendaRopas) {
        System.out.println("Aplicando descuento del 10% por invierno");
        for(Ropa ropa : tiendaRopas.getListaRopas()){
            ropa.setPrecioDescuento(ropa.getPrecio()*cambioPrecio);
        }
    }

    @Override
    public void showPreciosRopas(TiendaRopas tiendaRopas) {
        System.out.println("-------------------Precios en Invierno-------------------");
        List<Ropa> listaRopas = tiendaRopas.getListaRopas();
        for(int i = 0; i < listaRopas.size(); i++){
            System.out.println(" - Ropa: " + (i+1) + ", Tipo: " + listaRopas.get(i).getTipo() + ", Precio con descuento: " + listaRopas.get(i).getPrecioDescuento());
        }
    }
}
