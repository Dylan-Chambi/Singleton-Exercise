package mediator.exercise;

public class PersonaQA extends Persona{
    private String grado;

    public PersonaQA(ICanalComunication canalComunication) {
        super(canalComunication);
    }

    public PersonaQA setGrado(String grado) {
        this.grado = grado;
        return this;
    }

    public String getGrado() {
        return grado;
    }

    @Override
    public void send(String msg) {
        canalComunication.send(msg,this);
    }

    @Override
    public void received(String msg) {
        System.out.println("INFO> cargo: " + getPersonaTypes() + " ci: " + getCi() + " name: " + getName() + " grado: " + getGrado());
        System.out.println("INFO> received " + msg);
    }
}
