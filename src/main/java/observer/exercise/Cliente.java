package observer.exercise;

import java.util.HashSet;
import java.util.Set;

public class Cliente implements IObserver {
    private Persona persona;
    private String numeroTelefono;

    public Cliente(Persona persona, String numeroTelefono) {
        this.persona = persona;
        this.numeroTelefono = numeroTelefono;
    }

    @Override
    public void update(Notificacion notificacion) {
        System.out.println("-----------------------Notificacion recibida: " + notificacion.getNotificationType()+ "-----------------------");
        System.out.println("Para el cliente con numero: " + numeroTelefono);
        System.out.println("Nombre: "+persona.getName()+ " CI: "+persona.getCi());
        System.out.println("Mensaje: ");
        notificacion.showInfo();
    }
}