package chainofresponsability.inclass;

public class ManagerHandler implements IHandler {

    private IHandler next;

    @Override
    public void setNext(IHandler handler) {
        next=handler;
    }

    @Override
    public void criteriaHandler(Persona persona) {
        AtencionCliente1 atencionCliente = new AtencionCliente1();
        this.setNext(atencionCliente);

        CertificadoNacimiento2 certificadoNacimiento = new CertificadoNacimiento2();
        atencionCliente.setNext(certificadoNacimiento);

        PagoBanco3 pagoBanco = new PagoBanco3();
        certificadoNacimiento.setNext(pagoBanco);

        FichaAtencion4 fichaAtencion = new FichaAtencion4();
        pagoBanco.setNext(fichaAtencion);

        Carnet5 carnet = new Carnet5();
        fichaAtencion.setNext(carnet);


        this.next.criteriaHandler(persona);
    }

    @Override
    public IHandler next() {
        return next;
    }
}
