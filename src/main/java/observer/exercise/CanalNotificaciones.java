package observer.exercise;

import java.util.*;

public class CanalNotificaciones implements ISubject {

    private List<IObserver> observers = new ArrayList<>();
    private List<Notificacion> notificacions = new ArrayList<>();
    private HashMap<IObserver, HashSet<NotificacionType>> notificacionTypeMap = new HashMap<>();

    public CanalNotificaciones() {

    }

    public void publishNotification(Notificacion notificacion){
        notificacions.add(notificacion);
        notifyObservers(notificacion);
    }
    @Override
    public void attach(IObserver observer, Set<NotificacionType> notificacionTypes) {
        observers.add(observer);
        notificacionTypeMap.put(observer, new HashSet<NotificacionType>(notificacionTypes));
    }

    @Override
    public void detach(IObserver observer, NotificacionType notificacionType) {
        if(notificacionTypeMap.containsKey(observer)){
            if(notificacionTypeMap.get(observer).size() > 1){
                notificacionTypeMap.get(observer).remove(notificacionType);
            }else{
                notificacionTypeMap.remove(observer);
            }
        }
    }


    @Override
    public void notifyObservers(Notificacion notificacion) {
        for (IObserver obs:observers) {
            if (notificacionTypeMap.containsKey(obs)) {
                if (notificacionTypeMap.get(obs).contains(notificacion.getNotificationType())) {
                    obs.update(notificacion);
                }
            }
        }
    }

}