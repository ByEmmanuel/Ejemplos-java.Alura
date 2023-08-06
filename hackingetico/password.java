package hackingetico;


public class password implements wifi{
    
    private Seguridad util;

    private password(){
        this.util = new Seguridad();
    }
    
    double contraseña = 298047933;

    public double getContraseña() {
        return contraseña;
    }

    public void setContraseña(double contraseña) {
        this.contraseña = contraseña;
    }

    @Override
    public void setClave(String clave) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setClave'");
    }

    @Override
    public boolean iniciarsesion(String clave) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'iniciarsesion'");
    }
}
