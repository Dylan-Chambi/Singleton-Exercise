package iterator.exercise;

public class Automovil {
    private int costo;
    private String modelo;
    private int numeroAsientos;
    private String tipo;

    public Automovil(int costo, String modelo, int numeroAsientos, String tipo) {
        this.costo = costo;
        this.modelo = modelo;
        this.numeroAsientos = numeroAsientos;
        this.tipo = tipo;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getNumeroAsientos() {
        return numeroAsientos;
    }

    public void setNumeroAsientos(int numeroAsientos) {
        this.numeroAsientos = numeroAsientos;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void showInfo(){
        System.out.println("Costo: "+costo);
        System.out.println("Modelo: "+modelo);
        System.out.println("Numero de asientos: "+numeroAsientos);
        System.out.println("Tipo: "+tipo);
    }
}
