package abstractFactory.exercise;

public class FactoryPasaje {
    public static Pasaje make(PasajeType type) {
        Pasaje pasaje;
        switch (type){
            case INFANTIL:
                pasaje =  new PasajeInfantes();
                break;
            case SOLIDARIO:
                pasaje = new PasajeSolidario();
                break;
            case STANDART:
                pasaje = new PasajeStandart();
                break;
            default:
                pasaje = new PasajeStandart();
                break;
        }
        return pasaje;
    }
}

