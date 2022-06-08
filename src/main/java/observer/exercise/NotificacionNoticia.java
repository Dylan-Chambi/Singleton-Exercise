package observer.exercise;

public class NotificacionNoticia extends Notificacion{
    private String exclusiva;

    public NotificacionNoticia(String exclusiva) {
        this.notificacionType = NotificacionType.NOTICIA;
        this.exclusiva = exclusiva;
    }

    public String getExclusiva() {
        return exclusiva;
    }

    public void setExclusiva(String exclusiva) {
        this.exclusiva = exclusiva;
    }


    @Override
    public void showInfo() {
        System.out.println("En exclusiva: " + exclusiva);
    }
}
