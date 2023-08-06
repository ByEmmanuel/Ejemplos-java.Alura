package mx.com.ByteBankbyEmmanuel;

public class Sistemainterno {
    
    private String clave = "Password";

    public boolean autentico(Autenticable gerente){
        boolean puedeIniciarSesion = gerente.iniciarsesion(clave);
       
        if (puedeIniciarSesion) {
            System.out.println("Log-In exitoso ");
            return true;
        }else{
            System.out.println("Error en el Log-In");
            return false;
        }
    }


}
