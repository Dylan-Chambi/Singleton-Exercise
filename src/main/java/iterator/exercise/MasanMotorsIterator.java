package iterator.exercise;

import java.util.Stack;

public class MasanMotorsIterator implements Iterator {

    private int position;
    private Stack<Automovil> automovilesList;

    public MasanMotorsIterator(Stack<Automovil> automovilesList) {
        this.automovilesList = automovilesList;
        position = 0;
    }

    @Override
    public Automovil next() {
        position++;
        return automovilesList.pop();
    }

    @Override
    public boolean hasNext() {
        return !automovilesList.isEmpty();
    }

    @Override
    public int getPosition() {
        return position;
    }
}
