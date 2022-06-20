package visitor.exercise;

import java.util.function.Function;

public class Librecambista implements IVisitor{

    @Override
    public Function<Double, Double> cambioDolarAMonedaLocal(Bolivia paisBolivia) {
        return (Double d) -> round(d*6.90, 2);
    }

    @Override
    public Function<Double, Double> cambioMonedaLocalADolar(Bolivia paisBolivia) {
        return (Double d) -> round(d/6.90, 2);
    }

    @Override
    public Function<Double, Double> cambioDolarAMonedaLocal(Argentina paisArgentina) {
        return (Double d) -> round(d*122.81, 2);
    }

    @Override
    public Function<Double, Double> cambioMonedaLocalADolar(Argentina paisArgentina) {
        return (Double d) -> round(d/122.81, 2);
    }

    @Override
    public Function<Double, Double> cambioDolarAMonedaLocal(Brasil paisBrasil) {
        return (Double d) -> round(d*5.15, 2);
    }

    @Override
    public Function<Double, Double> cambioMonedaLocalADolar(Brasil paisBrasil) {
        return (Double d) -> round(d/5.15, 2);
    }

    @Override
    public Function<Double, Double> cambioDolarAMonedaLocal(Italia paisItalia) {
        return (Double d) -> round(d*0.95, 2);
    }

    @Override
    public Function<Double, Double> cambioMonedaLocalADolar(Italia paisItalia) {
        return (Double d) -> round(d/0.95, 2);
    }

    private static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();
        long factor = (long) Math.pow(10, places);
        value = value * factor;
        long tmp = Math.round(value);
        return (double) tmp / factor;
    }
}
