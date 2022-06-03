package memento.exercise;

import javax.xml.crypto.Data;

public class Memento {
    private Database state;

    public Memento(Database database){
        state=database;
    }

    public Database getState() {
        return state;
    }
}
