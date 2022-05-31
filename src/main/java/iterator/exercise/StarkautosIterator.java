package iterator.exercise;

public class StarkautosIterator implements Iterator{
    private int position;
    private Automovil[] automovilesList;

    public StarkautosIterator(Automovil[] automovilesList){
         this.automovilesList=automovilesList;
         position=0;
    }

    @Override
    public Automovil next() {
        return automovilesList[position++];
    }

    @Override
    public boolean hasNext() {
        return automovilesList.length != 0 && position < automovilesList.length;
    }

    @Override
    public int getPosition() {
        return position;
    }
}
