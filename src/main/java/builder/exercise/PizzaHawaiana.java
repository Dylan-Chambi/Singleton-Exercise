package builder.exercise;

public class PizzaHawaiana extends BuilderPizza {

        @Override
        public void buildIngredientes() {
            this.pizza.setIngredientes(new String[]{"Piña", "Salsa de Tomate", "Otro"});
        }

        @Override
        public void buildTipoMasa() {
            this.pizza.setTipoMasa("Masa Normal");
        }

        @Override
        public void buildTipoQueso() {
            this.pizza.setTipoQueso("Queso Mozzarella tipo2");
        }

}
