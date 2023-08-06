package mx.com.ByteBankbyEmmanuel;

public abstract class Funcionario{
    
    private String nombre;
    private String documento;
    private double salario;
    private int tipo;
    public Object util;
    
    

    //constructor es un metodo del mismo tipo de retorno de la clase y que puede aceptar parametros o no, para asignarlo a las variables
    public Funcionario(){

    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public abstract double getBonificacion ();

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }   

}