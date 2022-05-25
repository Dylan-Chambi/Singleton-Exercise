package builder.exercise;

public abstract class BuilderPizza {
    protected Pizza pizza;

    public Pizza getPizza() {
        return pizza;
    }

    public void createPizza() {
        this.pizza = new Pizza();
    }

    public abstract void buildIngredientes();
    public abstract void buildTipoMasa();
    public abstract void buildTipoQueso();

}
