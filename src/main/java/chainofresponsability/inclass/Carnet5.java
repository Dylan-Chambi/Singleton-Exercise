package chainofresponsability.inclass;

public class Carnet5 implements IHandler {
    private IHandler next;
    @Override
    public void setNext(IHandler handler) {
        next=handler;
    }

    @Override
    public void criteriaHandler(Persona persona) {
        System.out.println("Aqui tiene su carnet!");
    }

    @Override
    public IHandler next() {
        return next;
    }
}
