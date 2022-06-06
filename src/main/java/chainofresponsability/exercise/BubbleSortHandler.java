package chainofresponsability.exercise;

public class BubbleSortHandler implements IHandler {
    private IHandler next;
    @Override
    public void setNext(IHandler handler) {
        next=handler;
    }

    @Override
    public void criteriaHandler(Persona[] personaArray) {
        if (personaArray.length <= 20){
            System.out.println("Usando BubbleSort");
            SortArray.sort(SortAlgorithm.BUBBLE_SORT, personaArray, Persona.comparatorPersona);
        } else {
            next.criteriaHandler(personaArray);
        }

    }

    @Override
    public IHandler next() {
        return next;
    }
}
