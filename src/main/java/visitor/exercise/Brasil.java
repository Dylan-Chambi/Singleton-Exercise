package visitor.exercise;

import java.util.function.Function;

enum Brasil implements IPais {
    paisInstance {
        private final String nombreMoneda = "Real Brasileño";
        private final String presidente = "Jair Bolsonaro";
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
            System.out.println("Pais: Brasil");
            System.out.println("Presidente: " + presidente);
            System.out.println("Moneda: " + nombreMoneda);
        }
    }
}
