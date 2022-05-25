package builder.exercise;

public class PizzaClasica extends BuilderPizza {

        @Override
        public void buildIngredientes() {
            this.pizza.setIngredientes(new String[]{"Salsa de Tomate", "Otro"});
        }

        @Override
        public void buildTipoMasa() {
            this.pizza.setTipoMasa("Masa Especial");
        }

        @Override
        public void buildTipoQueso() {
            this.pizza.setTipoQueso("Doble Queso Mozzarella tipo2");
        }

}
