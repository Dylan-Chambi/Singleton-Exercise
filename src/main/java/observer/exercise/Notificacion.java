package observer.exercise;

public abstract class Notificacion {
    protected NotificacionType notificacionType;
    public NotificacionType getNotificationType(){
        return notificacionType;
    }

    public abstract void showInfo();
}
