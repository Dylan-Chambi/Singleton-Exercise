package observer.exercise;

import java.util.HashSet;
import java.util.Set;

public class Client {
    public static void main (String [] args){
        CanalNotificaciones subject = new CanalNotificaciones();
        NotificacionPromocion notificacionPromocion = new NotificacionPromocion("Anual", "Por la compra de tal cosa, recibe un descuento");
        NotificacionPremio notificacionPremio = new NotificacionPremio("Credito Extra","Usted es el ganador del credito extra");
        NotificacionNoticia notificacionNoticia = new NotificacionNoticia("Se ha confirmado una pandemia global de coronavirus");
        NotificacionPrecioLlamada notificacionPrecioLlamada = new NotificacionPrecioLlamada("Se debe llamar solo durante el fin de semana","5Bs");



        Cliente c1 = new Cliente(new Persona("Juan","12345678"), "123456789");
        subject.attach(c1, new HashSet<>(Set.of(NotificacionType.PREMIO, NotificacionType.PROMOCION)));

        Cliente c2 = new Cliente(new Persona("Pedro","12345678"), "123456789");
        subject.attach(c2, new HashSet<>(Set.of(NotificacionType.NOTICIA)));

        Cliente c3 = new Cliente(new Persona("Carlos","12345678"), "123456789");
        subject.attach(c3, new HashSet<>(Set.of(NotificacionType.PREMIO, NotificacionType.PROMOCION, NotificacionType.NOTICIA, NotificacionType.PRECIO_LLAMADA)));

        subject.publishNotification(notificacionPromocion);
        subject.publishNotification(notificacionPremio);
        subject.publishNotification(notificacionNoticia);
        subject.publishNotification(notificacionPrecioLlamada);


        Cliente c4 = new Cliente(new Persona("Maria","12345678"), "123456789");
        subject.attach(c4, new HashSet<>(Set.of(NotificacionType.PREMIO, NotificacionType.PROMOCION, NotificacionType.NOTICIA, NotificacionType.PRECIO_LLAMADA)));

        NotificacionNoticia notificacionNoticia2 = new NotificacionNoticia("Real Madrid gana la Champions League");
        subject.detach(c3, NotificacionType.NOTICIA);


        subject.publishNotification(notificacionNoticia2);





    }
}