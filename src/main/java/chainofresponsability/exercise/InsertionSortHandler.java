package chainofresponsability.exercise;

public class InsertionSortHandler implements IHandler {
    private IHandler next;
    @Override
    public void setNext(IHandler handler) {
        next=handler;
    }

    @Override
    public void criteriaHandler(Persona[] personaArray) {
        if (personaArray.length > 20 && personaArray.length <= 50){
            System.out.println("Usando InsertionSort");
            SortArray.sort(SortAlgorithm.INSERT_SORT, personaArray, Persona.comparatorPersona);
        } else {
            next.criteriaHandler(personaArray);
        }

    }

    @Override
    public IHandler next() {
        return next;
    }
}
