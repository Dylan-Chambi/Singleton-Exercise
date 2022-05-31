package iterator.exercise;

public class StarkautosAggregate implements IAggregate {
    private Automovil[] automovilesList;

    public StarkautosAggregate(){
        automovilesList = new Automovil[0];
    }

    public void add (Automovil value){
        Automovil[] newAutomovilesList = new Automovil[automovilesList.length+1];
        for (int i=0; i<automovilesList.length; i++){
            newAutomovilesList[i]=automovilesList[i];
        }
        newAutomovilesList[newAutomovilesList.length-1]=value;
        automovilesList=newAutomovilesList;
    }

    @Override
    public StarkautosIterator createIterator() {
        return new StarkautosIterator(automovilesList);
    }
}
