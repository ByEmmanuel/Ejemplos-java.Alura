package mx.com.ByteBankTest;

import mx.com.ByteBankbyEmmanuel.*;

public class TestSistemaInterno {
    
    public static void main(String[] args) {
        Sistemainterno sistema = new Sistemainterno();
        Gerente gerente1 = new Gerente();
        gerente1.iniciarsesion("Password");
        Administrador admin = new Administrador();
       
        sistema.autentico(gerente1);
        sistema.autentico(admin);
    }


}
