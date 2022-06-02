package mediator.exercise;

public class PersonaDEV extends Persona {

    private String lenguaje;

    public PersonaDEV(ICanalComunication canalComunication) {
        super(canalComunication);
    }

    public PersonaDEV setLenguaje(String lenguaje) {
        this.lenguaje = lenguaje;
        return this;
    }

    public String getLenguaje() {
        return lenguaje;
    }

    @Override
    public void send(String msg) {
        canalComunication.send(msg, this);
    }

    @Override
    public void received(String msg) {
        System.out.println("INFO> cargo: " + getPersonaTypes() + " ci: " + getCi() + " name: " + getName() + " lenguaje: " + getLenguaje());
        System.out.println("INFO> received " + msg);
    }
}

