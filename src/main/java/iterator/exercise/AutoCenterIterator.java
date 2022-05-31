package iterator.exercise;

import java.util.ArrayList;

public class AutoCenterIterator implements Iterator {
    private int position;
    private ArrayList<Automovil> automovilesList;

    public AutoCenterIterator(ArrayList<Automovil> automovilesList) {
        this.automovilesList = automovilesList;
        position = 0;
    }

    @Override
    public Automovil next() {
        return automovilesList.get(position++);
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
