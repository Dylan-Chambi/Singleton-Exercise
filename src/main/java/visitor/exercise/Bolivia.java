package visitor.exercise;

import java.util.function.Function;

enum Bolivia implements IPais {
    paisInstance {
        private final String nombreMoneda = "Boliviano";
        private final String presidente = "Luis Arce";
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
            System.out.println("Pais: Bolivia");
            System.out.println("Presidente: " + presidente);
            System.out.println("Moneda: " + nombreMoneda);
        }
    }
}
