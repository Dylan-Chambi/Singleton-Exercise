package visitor.exercise;

import java.util.function.Function;

public interface IVisitor {
    Function<Double, Double> cambioDolarAMonedaLocal(Bolivia paisBolivia);
    Function<Double, Double> cambioMonedaLocalADolar(Bolivia paisBolivia);

    Function<Double, Double> cambioDolarAMonedaLocal(Argentina paisArgentina);
    Function<Double, Double> cambioMonedaLocalADolar(Argentina paisArgentina);

    Function<Double, Double> cambioDolarAMonedaLocal(Brasil paisBrasil);
    Function<Double, Double> cambioMonedaLocalADolar(Brasil paisBrasil);

    Function<Double, Double> cambioDolarAMonedaLocal(Italia paisItalia);
    Function<Double, Double> cambioMonedaLocalADolar(Italia paisItalia);


}
