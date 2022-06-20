package visitor.exercise;

import java.util.function.Function;

enum Argentina implements IPais {
    paisInstance {
        private final String nombreMoneda = "Peso Argentino";
        private final String presidente = "Alberto Fernández";
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
            System.out.println("Pais: Argentina");
            System.out.println("Presidente: " + presidente);
            System.out.println("Moneda: " + nombreMoneda);
        }
    }
}
