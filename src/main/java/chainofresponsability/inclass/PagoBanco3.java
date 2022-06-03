package chainofresponsability.inclass;

public class PagoBanco3 implements IHandler {
    private IHandler next;
    @Override
    public void setNext(IHandler handler) {
        next=handler;
    }

    @Override
    public void criteriaHandler(Persona persona) {
        if (!persona.isHizoPagoAlBanco()){
            System.out.println("Por favor vaya a un cajero o a un banco");
        } else {
            next.criteriaHandler(persona);
        }

    }

    @Override
    public IHandler next() {
        return next;
    }
}
