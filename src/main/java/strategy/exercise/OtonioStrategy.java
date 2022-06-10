package strategy.exercise;

import java.util.List;

public class OtonioStrategy implements IStrategy{
    private static double cambioPrecio = 0.5;
    @Override
    public void startStrategy(TiendaRopas tiendaRopas) {
        System.out.println("Aplicando descueento de 50% por otoño");
        for(Ropa ropa : tiendaRopas.getListaRopas()){
            ropa.setPrecioDescuento(ropa.getPrecio()*cambioPrecio);
        }
    }

    @Override
    public void showPreciosRopas(TiendaRopas tiendaRopas) {
        System.out.println("-------------------Precios en Otoño-------------------");
        List<Ropa> listaRopas = tiendaRopas.getListaRopas();
        for(int i = 0; i < listaRopas.size(); i++){
            System.out.println(" - Ropa: " + (i+1) + ", Tipo: " + listaRopas.get(i).getTipo() + ", Precio con descuento: " + listaRopas.get(i).getPrecioDescuento());
        }
    }
}
