package mx.com.ByteBankbyEmmanuel;
public class Administrador extends Funcionario implements Autenticable{

    private AutenticacionUtil util;

    public Administrador(){
        this.util = new AutenticacionUtil();
    }

    @Override
    public double getBonificacion(){
        return this.getSalario();
    }

    @Override
    public boolean iniciarsesion(String clave) {
        return this.util.iniciarsesion(clave);
        
    }

    @Override
    public void setClave(String clave) {
        this.util.setClave(clave);
    }

    
}
