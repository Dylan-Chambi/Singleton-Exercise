package chainofresponsability.inclass;

public class CertificadoNacimiento2 implements IHandler {
    private IHandler next;
    @Override
    public void setNext(IHandler handler) {
        next=handler;
    }

    @Override
    public void criteriaHandler(Persona persona) {
        if (!persona.isTieneCertificadoNacimiento()){
            System.out.println("Por favor vaya con un notario");
        } else {
            next.criteriaHandler(persona);
        }

    }

    @Override
    public IHandler next() {
        return next;
    }
}
