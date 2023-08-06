package mx.com.ByteBankbyEmmanuel;

public class Gerente extends Funcionario implements Autenticable{


    //sobreescritura de datos
    public double getBonificacion(){
        System.out.println("Ejecutando test de gerente");
        return super.getSalario() + this.getSalario() * 0.5;
        
    }

    @Override
    public void setClave(String clave) {
        
    }

    @Override
    public boolean iniciarsesion(String clave) {
      return false;
    }
}