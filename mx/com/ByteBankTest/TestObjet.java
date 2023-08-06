package mx.com.ByteBankTest;
import mx.com.ByteBankbyEmmanuel.*;

public class TestObjet {
    public static void main(String[] args) throws ArgumentoNoValidoEx {
        
        
        Object cp = new CuentaCorriente(22, 33);
        Object cc = new CuentaAhorros(33, 22);

        System.out.println(cp);
        System.out.println(cc);
//tipo de dato, variable, valor.
        int numero = 3;
        double valor = numero;  //Cast implicito 


        int numero2 = 2;
        double valor2 = (double) numero2; //Cast explicito 

        double valor3 = 3.59;
        int numero3 = (int) valor3; //Cast Explicito Es Exigido Por El Compilador


        
    }
}
