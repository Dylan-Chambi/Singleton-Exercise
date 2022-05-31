package iterator.exercise;

import java.util.HashMap;

public class AduanaIterator implements Iterator {
    private int position;
    private HashMap<Automovil, String> automovilesList;

    public AduanaIterator(HashMap<Automovil, String> automovilesList) {
        this.automovilesList = automovilesList;
    }

    @Override
    public Automovil next() {
        return (Automovil) automovilesList.keySet().toArray()[position++];
    }

    @Override
    public boolean hasNext() {
        return automovilesList.size() != 0 && position < automovilesList.size();
    }

    @Override
    public int getPosition() {
        return position;
    }
}
