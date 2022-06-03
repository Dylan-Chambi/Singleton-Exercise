package chainofresponsability.inclass;

public class FichaAtencion4 implements IHandler {
    private IHandler next;
    @Override
    public void setNext(IHandler handler) {
        next=handler;
    }

    @Override
    public void criteriaHandler(Persona persona) {
        if (!persona.isTieneFichaAtencion()){
            System.out.println("Por favor vaya con un organizador de fichas");
        } else {
            next.criteriaHandler(persona);
        }

    }

    @Override
    public IHandler next() {
        return next;
    }
}
