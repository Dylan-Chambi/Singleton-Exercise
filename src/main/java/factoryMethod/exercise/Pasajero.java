package factoryMethod.exercise;

public class Pasajero {
    private String nombre;
    private String ci;
    private String fechaNacimiento;


    public String getNombre() {
        return nombre;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public String toString(){
        return "Nombre: " + nombre + " CI: " + ci + (fechaNacimiento != null? " Fecha de Nacimiento: " + fechaNacimiento : "");
    }
}
