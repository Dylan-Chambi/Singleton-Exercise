package strategy.exercise;

import java.util.ArrayList;
import java.util.List;

public class TiendaRopas {
    private IStrategy strategy;
    private List<Ropa> listaRopas = new ArrayList<>();

    public IStrategy getStrategy() {
        return strategy;
    }

    public List<Ropa> getListaRopas() {
        return listaRopas;
    }

    public void setListaRopas(List<Ropa> listaRopas) {
        this.listaRopas = listaRopas;
    }

    public TiendaRopas() {
        this.strategy = new PrimaveraStrategy();
    }

    public void setStrategy(IStrategy strategy) {
        this.strategy = strategy;
    }

    public void addRopa(Ropa ropa) {
        listaRopas.add(ropa);
    }

    public void startStrategy(){
        strategy.startStrategy(this);
    }

    public void showPreciosRopas(){
        strategy.showPreciosRopas(this);
    }


}
