package mx.com.ByteBankbyEmmanuel;

// Excepcion Checked

public class ArgumentoNoValidoEx extends Exception {
     
    private String mensaje;

    // Constructor que recibe el mensaje personalizado
    public ArgumentoNoValidoEx(String mensaje) {
        this.mensaje = mensaje;
    }

    // Constructor sin argumentos que usa un mensaje predeterminado
    public ArgumentoNoValidoEx() {
        this("Agencia Inválida");
    }

    // Sobrescribir el método getMessage() para obtener el mensaje de la excepción
    @Override
    public String getMessage() {
        return mensaje;
    }

   
}
