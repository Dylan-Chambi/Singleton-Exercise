package visitor.exercise;

import java.util.function.Function;

public interface IPais {
     Function<Double, Double> cambioDolarAMonedaLocal(IVisitor visitor);

     Function<Double, Double> cambioMonedaLocalADolar(IVisitor visitor);
     void showInfo();
}
