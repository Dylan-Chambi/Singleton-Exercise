package chainofresponsability.inclass;

public class AtencionCliente1 implements IHandler {
    private IHandler next;
    @Override
    public void setNext(IHandler handler) {
        next=handler;
    }

    @Override
    public void criteriaHandler(Persona persona) {
        int requisitosFaltantes = 0;

        if (!persona.isTieneCertificadoNacimiento()) requisitosFaltantes++;
        if(!persona.isTieneFichaAtencion()) requisitosFaltantes++;
        if(!persona.isHizoPagoAlBanco()) requisitosFaltantes++;

        if (requisitosFaltantes > 1){
            System.out.println("Por favor vaya a atencion al cliente");
        } else {
            next.criteriaHandler(persona);
        }

    }

    @Override
    public IHandler next() {
        return next;
    }
}
