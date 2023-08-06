package mx.com.ByteBankbyEmmanuel;

public class Contador extends Funcionario {
    

// sobrescribir bonificacion

    @Override
    public double getBonificacion(){
        System.out.println("Ejecutando test de contador");
        return 200;
    }
}
