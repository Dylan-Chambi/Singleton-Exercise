package memento.exercise;

import java.util.ArrayList;

public class Database implements IPrototype {
    private ArrayList<Persona> personasBaseDeDatos = new ArrayList<>();


    public void addToDatabase(Persona persona){
        personasBaseDeDatos.add(persona);
    }

    public void removeFromDatabase(int index){
        if(index<personasBaseDeDatos.size()){
            personasBaseDeDatos.remove(index);
        }else {
            System.out.println("No existe el indice");
        }
    }


    public void showInfo() {
        for(int i=0;i<personasBaseDeDatos.size();i++){
            System.out.println("Persona "+(i+1)+":");
            personasBaseDeDatos.get(i).showInfo();
        }
    }

    @Override
    public Database clone() {
        Database database = new Database();
        for(int i=0;i<personasBaseDeDatos.size();i++){
            database.addToDatabase(personasBaseDeDatos.get(i).clone());
        }
        return database;
    }
}
