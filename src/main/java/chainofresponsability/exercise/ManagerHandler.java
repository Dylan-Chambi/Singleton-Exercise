package chainofresponsability.exercise;

public class ManagerHandler implements IHandler {

    private IHandler next;

    @Override
    public void setNext(IHandler handler) {
        next=handler;
    }

    @Override
    public void criteriaHandler(Persona[] personaArray) {
        BubbleSortHandler bubbleSortHandler = new BubbleSortHandler();
        this.setNext(bubbleSortHandler);

        InsertionSortHandler insertionSortHandler = new InsertionSortHandler();
        bubbleSortHandler.setNext(insertionSortHandler);

        QuickSortHandler quickSortHandler = new QuickSortHandler();
        insertionSortHandler.setNext(quickSortHandler);


        this.next.criteriaHandler(personaArray);
    }

    @Override
    public IHandler next() {
        return next;
    }
}
