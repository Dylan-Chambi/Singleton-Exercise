package memento.exercise;

import java.util.ArrayList;

public class Database {
    private ArrayList<Persona> personasBaseDeDatos = new ArrayList<>();


    public void addToDatabase(Persona persona){
        personasBaseDeDatos.add(persona);
    }


    public void showInfo() {
        for(int i=0;i<personasBaseDeDatos.size();i++){
            System.out.println("Persona "+(i+1)+":");
            personasBaseDeDatos.get(i).showInfo();
        }
    }
}
