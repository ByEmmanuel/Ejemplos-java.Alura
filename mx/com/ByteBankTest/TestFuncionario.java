package mx.com.ByteBankTest;
import mx.com.ByteBankbyEmmanuel.*;



public class TestFuncionario {
 
   
    public static void main(String[] args) {
        Funcionario funcionario = new Contador();
        funcionario.setNombre("Emmanuel");
        funcionario.setDocumento("");
        funcionario.setSalario(2000);

        System.out.println(funcionario.getNombre());
        System.out.println(funcionario.getSalario());
        System.out.println(funcionario.getBonificacion());
        

   
    }
    
}
