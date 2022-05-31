package iterator.exercise;

import java.util.ArrayList;

public class AutoCenterAggregate implements IAggregate {
    private ArrayList<Automovil> automovilesList;

    public AutoCenterAggregate() {
        automovilesList = new ArrayList<Automovil>();
    }

    public void add(Automovil value) {
        automovilesList.add(value);
    }

    @Override
    public AutoCenterIterator createIterator() {
        return new AutoCenterIterator(automovilesList);
    }
}
