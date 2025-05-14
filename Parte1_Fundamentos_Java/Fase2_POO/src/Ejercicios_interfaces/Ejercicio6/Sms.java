package Ejercicios_interfaces.Ejercicio6;

public class Sms implements Notificacion{
    @Override
    public String enviarMensaje() {
        return "Hola Tomas";
    }
}
