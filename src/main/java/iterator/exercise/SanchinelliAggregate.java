package iterator.exercise;

import java.util.Vector;

public class SanchinelliAggregate implements IAggregate {

    private Vector<Automovil> automovilesList;

    public SanchinelliAggregate() {
        this.automovilesList = new Vector<Automovil>();
    }

    public void add(Automovil value) {
        automovilesList.add(value);
    }

    @Override
    public Iterator createIterator() {
        return new SanchinelliIterator(automovilesList);
    }
}
