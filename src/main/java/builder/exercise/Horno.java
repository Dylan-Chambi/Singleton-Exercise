package builder.exercise;

public class Horno {
    private BuilderPizza builder;

    public Pizza getProduct() {
        return builder.getPizza();
    }

    public void setBuilder(BuilderPizza builder) {
        this.builder = builder;
    }

    public void buildProduct() {
        this.builder.createPizza();
        this.builder.buildIngredientes();
        this.builder.buildTipoMasa();
        this.builder.buildTipoQueso();
    }
}
