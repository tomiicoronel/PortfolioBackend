package Ejercicios_interfaces.Ejercicio6;

public class Email implements Notificacion{
    @Override
    public String enviarMensaje() {
        return "Hola aaa@gmail.com";
    }
}
