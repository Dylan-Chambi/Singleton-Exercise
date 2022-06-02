package mediator.exercise;

public class PersonaSM extends Persona {

    private String[] certificaciones;

    public PersonaSM(ICanalComunication canalComunication) {
        super(canalComunication);
    }

    public PersonaSM setCertificaciones(String[] certificaciones) {
        this.certificaciones = certificaciones;
        return this;
    }

    public String[] getCertificaciones() {
        return certificaciones;
    }

    @Override
    public void send(String msg) {
        canalComunication.send(msg, this);
    }

    @Override
    public void received(String msg) {
        System.out.print("INFO> cargo: " + getPersonaTypes() + " ci: " + getCi() + " name: " + getName() + " certificaciones: [");
        for(int i=0;i<certificaciones.length;i++){
            System.out.print(certificaciones[i]);
            if(i<certificaciones.length-1){
                System.out.print(", ");
            }
        }
        System.out.println("]");
        System.out.println("INFO> received " + msg);
    }
}
