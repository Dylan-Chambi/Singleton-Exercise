package visitor.exercise;

import java.util.function.Function;

enum Italia implements IPais {
    paisInstance {
        private final String nombreMoneda = "Euro";
        private final String presidente = "Sergio Mattarella";
        @Override
        public Function<Double, Double> cambioDolarAMonedaLocal(IVisitor visitor) {
            return visitor.cambioDolarAMonedaLocal(this);
        }

        @Override
        public Function<Double, Double> cambioMonedaLocalADolar(IVisitor visitor) {
            return visitor.cambioMonedaLocalADolar(this);
        }

        @Override
        public void showInfo() {
            System.out.println("Pais: Italia");
            System.out.println("Presidente: " + presidente);
            System.out.println("Moneda: " + nombreMoneda);
        }
    }
}
