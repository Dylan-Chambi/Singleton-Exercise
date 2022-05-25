package builder.exercise;

public class Client {
    public static void main(String[] args) {
        Horno horno = new Horno();
        BuilderPizza builderPizzaHawaiana = new PizzaHawaiana();
        horno.setBuilder(builderPizzaHawaiana);
        horno.buildProduct();
        Pizza pizzaHawaiana = horno.getProduct();
        pizzaHawaiana.showInfo();

        BuilderPizza builderPizzaClasica = new PizzaClasica();
        horno.setBuilder(builderPizzaClasica);
        horno.buildProduct();
        Pizza pizzaClasica = horno.getProduct();
        pizzaClasica.showInfo();

        BuilderPizza builderPizzaCarnivora = new PizzaCarnivora();
        horno.setBuilder(builderPizzaCarnivora);
        horno.buildProduct();
        Pizza pizzaCarnivora = horno.getProduct();
        pizzaCarnivora.showInfo();

        Pizza pizzaPersonalizada =
                new Pizza()
                        .setIngredientes(new String[]{"Jamon", "Salsa de Tomate", "Otro"})
                        .setTipoMasa("Masa Delgada")
                        .setTipoQueso("Queso Cheddar");
        pizzaPersonalizada.showInfo();
    }
}
