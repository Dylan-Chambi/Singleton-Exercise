package bridge.exercise;

public class Paquete {
    private String nombrePaquete;
    private String remitente;
    private String destinatario;
    private double peso;
    private double precio;

    public String getNombrePaquete() {
        return nombrePaquete;
    }

    public Paquete setNombrePaquete(String nombrePaquete) {
        this.nombrePaquete = nombrePaquete;
        return this;
    }

    public String getRemitente() {
        return remitente;
    }

    public Paquete setRemitente(String remitente) {
        this.remitente = remitente;
        return this;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public Paquete setDestinatario(String destinatario) {
        this.destinatario = destinatario;
        return this;
    }

    public double getPeso() {
        return peso;
    }

    public Paquete setPeso(double peso) {
        this.peso = peso;
        return this;
    }

    public double getPrecio() {
        return precio;
    }

    public Paquete setPrecio(double precio) {
        this.precio = precio;
        return this;
    }
}
