package chainofresponsability.exercise;

import java.util.Comparator;

public class Persona {
    private String ci;
    private String nombre;
    private int edad;
    public static Comparator<Persona> comparatorPersona;

    public Persona() {
        setComparatorPersona();
    }

    public String getCi() {
        return ci;
    }

    public Persona setCi(String ci) {
        this.ci = ci;
        return this;
    }

    public String getNombre() {
        return nombre;
    }

    public Persona setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public int getEdad() {
        return edad;
    }

    public Persona setEdad(int edad) {
        this.edad = edad;
        return this;
    }

    private void setComparatorPersona() {
        comparatorPersona = new Comparator<Persona>() {
            @Override
            public int compare(Persona p1, Persona p2) {
                if(p1.getEdad() > p2.getEdad()){
                    return 1;
                }else if(p1.getEdad() < p2.getEdad()){
                    return -1;
                } else return p1.getNombre().compareTo(p2.getNombre());
            }
        };
    }
}
