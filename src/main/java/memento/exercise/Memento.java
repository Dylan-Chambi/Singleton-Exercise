package memento.exercise;


public class Memento implements IPrototype {
    private Database state;

    public Memento(Database database){
        state=database;
    }

    public Database getState() {
        return state;
    }


    @Override
    public Memento clone() {
        return new Memento(state.clone());
    }
}
