package builder.exercise;

public class Pizza {
    private String[] ingredientes;
    private String tipoMasa;
    private String tipoQueso;

    public Pizza(){

    }

    public String[] getIngredientes() {
        return ingredientes;
    }

    public Pizza setIngredientes(String[] ingredientes) {
        this.ingredientes = ingredientes;
        return this;
    }

    public String getTipoMasa() {
        return tipoMasa;
    }

    public Pizza setTipoMasa(String tipoMasa) {
        this.tipoMasa = tipoMasa;
        return this;
    }

    public String getTipoQueso() {
        return tipoQueso;
    }

    public Pizza setTipoQueso(String tipoQueso) {
        this.tipoQueso = tipoQueso;
        return this;
    }

    public void showInfo(){
        String IngredientesPrint = "Ingredientes: [";
        for (int i = 0; i < ingredientes.length; i++) {
            IngredientesPrint += ingredientes[i] + (i == ingredientes.length - 1 ? "" : ", ");
        }
        IngredientesPrint += "]";
        System.out.println(IngredientesPrint);
        System.out.println("Tipo de masa: " + tipoMasa);
        System.out.println("Tipo de queso: " + tipoQueso);
    }
}
