package chainofresponsability.exercise;

public class QuickSortHandler implements IHandler {
    private IHandler next;
    @Override
    public void setNext(IHandler handler) {
        next=handler;
    }

    @Override
    public void criteriaHandler(Persona[] personaArray) {
        if (personaArray.length > 50){
            System.out.println("Usando QuickSort");
            SortArray.sort(SortAlgorithm.QUICK_SORT, personaArray, Persona.comparatorPersona);
        } else {
            next.criteriaHandler(personaArray);
        }

    }

    @Override
    public IHandler next() {
        return next;
    }
}
