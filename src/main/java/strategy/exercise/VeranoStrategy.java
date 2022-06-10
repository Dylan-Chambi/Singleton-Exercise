package strategy.exercise;

import java.util.List;

public class VeranoStrategy implements IStrategy{
    private static double cambioPrecio = 1.1;
    @Override
    public void startStrategy(TiendaRopas tiendaRopas) {
        System.out.println("Subiendo el precio un 10% por Verano");
        for(Ropa ropa : tiendaRopas.getListaRopas()){
            ropa.setPrecioDescuento(ropa.getPrecio()*cambioPrecio);
        }
    }

    @Override
    public void showPreciosRopas(TiendaRopas tiendaRopas) {
        System.out.println("-------------------Precios en Verano-------------------");
        List<Ropa> listaRopas = tiendaRopas.getListaRopas();
        for(int i = 0; i < listaRopas.size(); i++){
            System.out.println(" - Ropa: " + (i+1) + ", Tipo: " + listaRopas.get(i).getTipo() + ", Precio con descuento: " + listaRopas.get(i).getPrecioDescuento());
        }
    }
}
