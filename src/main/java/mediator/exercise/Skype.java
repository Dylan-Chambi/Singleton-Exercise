package mediator.exercise;

import java.util.HashMap;
import java.util.Map;

public class Skype implements ICanalComunication{

    Map<String, Persona> chatSkype = new HashMap<>();
    

    public Skype addPersonaToChat(Persona persona){
        if(!chatSkype.containsKey(persona.getCi())){
            chatSkype.put(persona.getCi(), persona);
        }else{
            System.out.println("La persona con ci " + persona.getCi() + " ya esta en el chat");
        }
        return this;
    }

    @Override
    public void send(String msg, Persona persona) {
        for (HashMap.Entry<String, Persona> personaInChat : chatSkype.entrySet()) {
            if(!persona.getCi().equals(personaInChat.getKey())){
                switch (persona.getPersonaTypes()) {
                    case QA:
                        if(personaInChat.getValue().getPersonaTypes() == PersonaTypes.QA){
                            personaInChat.getValue().received(msg);
                        }
                        break;
                    case DEV:
                        if(personaInChat.getValue().getPersonaTypes() == PersonaTypes.DEV){
                            personaInChat.getValue().received(msg);
                        }
                        break;
                    case SM:
                        personaInChat.getValue().received(msg);
                        break;
                    default:
                        break;
                }
            }
        }

    }
}
