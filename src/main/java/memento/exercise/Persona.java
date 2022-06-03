package memento.exercise;

public class Persona {
    private String name;
    private String ci;
    private int edad;

    public Persona(String name, String ci, int edad) {
        this.name = name;
        this.ci = ci;
        this.edad = edad;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void showInfo(){
        System.out.println("Nombre: "+name);
        System.out.println("CI: "+ci);
        System.out.println("Edad: "+edad);
        System.out.println("");
    }
}
