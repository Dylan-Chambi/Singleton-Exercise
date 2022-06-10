package strategy.exercise;

import java.util.List;

public class PrimaveraStrategy implements IStrategy{
    private static double cambioPrecio = 1.0;
    @Override
    public void startStrategy(TiendaRopas tiendaRopas) {
        System.out.println("Manteniendo el precio original");
        for(Ropa ropa : tiendaRopas.getListaRopas()){
            ropa.setPrecioDescuento(ropa.getPrecio()*cambioPrecio);
        }
    }

    @Override
    public void showPreciosRopas(TiendaRopas tiendaRopas) {
        System.out.println("-------------------Precios en Primavera-------------------");
        List<Ropa> listaRopas = tiendaRopas.getListaRopas();
        for(int i = 0; i < listaRopas.size(); i++){
            System.out.println(" - Ropa: " + (i+1) + ", Tipo: " + listaRopas.get(i).getTipo() + ", Precio: " + listaRopas.get(i).getPrecio());
        }
    }
}
