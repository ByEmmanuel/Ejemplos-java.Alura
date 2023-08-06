package mx.com.ByteBankbyEmmanuel;
public class AutenticacionUtil {
    
    private String clave; 

    public boolean iniciarsesion(String clave){
        return this.clave == clave;
    }

    public void setClave(String clave){
        this.clave = clave;
    }

}
