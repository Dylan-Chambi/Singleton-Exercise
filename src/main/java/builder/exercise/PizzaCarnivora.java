package builder.exercise;

public class PizzaCarnivora extends BuilderPizza{

        @Override
        public void buildIngredientes() {
            this.pizza.setIngredientes(new String[]{"Carne", "Salsa de Tomate", "Otro"});
        }

        @Override
        public void buildTipoMasa() {
            this.pizza.setTipoMasa("Masa Especial");
        }

        @Override
        public void buildTipoQueso() {
            this.pizza.setTipoQueso("Queso Mozzarella");
        }

}
