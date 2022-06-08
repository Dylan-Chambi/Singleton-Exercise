package observer.exercise;

public class NotificacionPremio extends Notificacion{
    private String tipo;
    private String descripcion;

    public NotificacionPremio(String tipo,String descripcion) {
        this.notificacionType = NotificacionType.PREMIO;
        this.tipo = tipo;
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public void showInfo() {
        System.out.println("El tipo de la Premio es: "+tipo);
        System.out.println("El nombre del Premio es: "+ descripcion);
    }
}
