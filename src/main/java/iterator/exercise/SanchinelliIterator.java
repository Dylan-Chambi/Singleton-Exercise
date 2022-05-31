package iterator.exercise;

import java.util.Vector;

public class SanchinelliIterator implements Iterator {

    private Vector<Automovil> nameList;
    private int position;

    public SanchinelliIterator(Vector<Automovil> nameList) {
        this.nameList = nameList;
        position = 0;
    }

    @Override
    public Automovil next() {
        return nameList.get(position++);
    }

    @Override
    public boolean hasNext() {
        return nameList.size() != 0 && position < nameList.size();
    }

    @Override
    public int getPosition() {
        return position;
    }
}
