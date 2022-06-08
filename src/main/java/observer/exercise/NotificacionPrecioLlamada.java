package observer.exercise;

public class NotificacionPrecioLlamada extends Notificacion{
    private String precio;
    private String condicion;

    public NotificacionPrecioLlamada(String condicion, String precio) {
        this.notificacionType = NotificacionType.PRECIO_LLAMADA;
        this.condicion = condicion;
        this.precio = precio;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getCondicion() {
        return condicion;
    }

    public void setCondicion(String condicion) {
        this.condicion = condicion;
    }

    @Override
    public void showInfo() {
        System.out.println("El precio de la llamada es: "+precio);
        System.out.println("La condicion de la llamada es: "+condicion);
    }
}
