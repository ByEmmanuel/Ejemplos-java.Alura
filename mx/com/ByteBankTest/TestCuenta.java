package mx.com.ByteBankTest;

import mx.com.ByteBankbyEmmanuel.*;

public class TestCuenta {
  
    public static void main(String[] args) throws ArgumentoNoValidoEx {
        CuentaCorriente cc = new CuentaCorriente(12, 2);
        CuentaAhorros ca = new CuentaAhorros(2, 3);

    cc.depositar(50);
    ca.depositar(50);        
            
    
        System.out.println("Dinero en cuenta Corriente; " + cc.getSaldo());
        // System.out.println("CA; " + ca.getSaldo());
    cc.transferir(10, ca);
    cc.transferir(10, ca);
    cc.transferir(10, ca);
    cc.transferir(10, ca);
    cc.transferir(9, ca);
    
    
   
    System.out.println("CC; " + cc.getSaldo());
    System.out.println("CC; " + ca.getSaldo());

    }
}
   