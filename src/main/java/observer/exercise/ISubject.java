package observer.exercise;

import java.util.Set;

public interface ISubject {
    //notificacion
    void attach(IObserver observer, Set<NotificacionType> notificacionTypes);//agregar/adjuntar a los observadores
    void detach(IObserver observer, NotificacionType notificacionType);//eliminar a los observadores
    void notifyObservers(Notificacion notificacion);
}