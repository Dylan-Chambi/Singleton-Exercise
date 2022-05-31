package iterator.exercise;

import java.util.Stack;

public class MasanMotorsAggregate implements IAggregate {
    private Stack<Automovil> automovilesList;

    public MasanMotorsAggregate() {
        automovilesList = new Stack<Automovil>();
    }

    public void add(Automovil value) {
        automovilesList.push(value);
    }

    @Override
    public MasanMotorsIterator createIterator() {
        return new MasanMotorsIterator(automovilesList);
    }
}
