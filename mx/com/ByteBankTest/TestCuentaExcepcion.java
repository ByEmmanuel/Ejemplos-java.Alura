package mx.com.ByteBankTest;
import mx.com.ByteBankbyEmmanuel.*;



public class TestCuentaExcepcion {
    public static void main(String[] args) throws ArgumentoNoValidoEx {
         
        Cuenta cuenta = new CuentaAhorros(343, 333);
        Cliente clt = new Cliente();
        clt.setNombre("Jesus");

        cuenta.depositar(200);
        
            cuenta.retirar(100);
            cuenta.retirar(10);  
            System.out.println(clt.getNombre()); 
      
    }
}
