package observer.exercise;

public class NotificacionPromocion extends Notificacion{
    private String tipoPromocion;

    private String descripcion;

    public NotificacionPromocion(String tipoPromocion, String descripcion) {
        this.notificacionType = NotificacionType.PROMOCION;
        this.tipoPromocion = tipoPromocion;
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipoPromocion() {
        return tipoPromocion;
    }

    public void setTipoPromocion(String tipoPromocion) {
        this.tipoPromocion = tipoPromocion;
    }

    @Override
    public void showInfo() {
        System.out.println("El tipo de la Promocion es: "+ tipoPromocion);
        System.out.println(descripcion);
    }
}
