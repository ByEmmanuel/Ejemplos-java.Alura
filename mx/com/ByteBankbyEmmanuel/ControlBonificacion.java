package mx.com.ByteBankbyEmmanuel;

public class ControlBonificacion {
    
    private double suma;

    public double registrarSalario(Funcionario funcionario){
        this.suma += funcionario.getBonificacion();
        System.out.println("La suma actual es " + this.suma);
        return this.suma;
    }

    
}
