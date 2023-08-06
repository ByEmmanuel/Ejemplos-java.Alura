package mx.com.ByteBankTest;

import mx.com.ByteBankbyEmmanuel.*;


public class TestGerente {
    
    public static void main(String[] args) {

        Gerente gerente = new Gerente();
        
        // Funcionario gerente = new Funcionario();
        gerente.setNombre("gerente");
        gerente.setSalario(4000);
        gerente.setTipo(1);
        gerente.setClave("Password");
        boolean autentico = gerente.iniciarsesion("Password");

        System.out.println(gerente.getNombre());
        System.out.println(gerente.getSalario());
        System.out.println(gerente.getBonificacion());
        if (autentico == true){
            System.out.println("usted puede acceder");
        }else{
            System.out.println("usted no puede acceder");
        }

        
        

    }
}
