package mediator.exercise;

public abstract class Persona {
    protected ICanalComunication canalComunication;
    private String ci;
    private String name;
    private PersonaTypes personaTypes;

    public Persona(ICanalComunication canalComunication) {
        this.canalComunication=canalComunication;
        if(this instanceof PersonaQA){
            this.personaTypes=PersonaTypes.QA;
        }else if(this instanceof PersonaDEV){
            this.personaTypes=PersonaTypes.DEV;
        }else if(this instanceof PersonaSM) {
            this.personaTypes = PersonaTypes.SM;
        }else throw new RuntimeException("Persona no reconocida");

    }

    public PersonaTypes getPersonaTypes() {
        return personaTypes;
    }

    public void setPersonaTypes(PersonaTypes personaTypes) {
        this.personaTypes = personaTypes;
    }

    public String getCi() {
        return ci;
    }

    public Persona setCi(String ci) {
        this.ci = ci;
        return this;
    }

    public ICanalComunication getCanalComunication() {
        return canalComunication;
    }

    public void setCanalComunication(ICanalComunication canalComunication) {
        this.canalComunication = canalComunication;
    }


    public String getName() {
        return name;
    }

    public Persona setName(String name) {
        this.name = name;
        return this;
    }

    public abstract void send(String msg);
    public abstract void received(String msg);
}
