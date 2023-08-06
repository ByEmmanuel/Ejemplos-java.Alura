package mx.com.ByteBankTest;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import mx.com.ByteBankbyEmmanuel.*;


public class TestArrayList {

    public static void main(String[] args)throws ArgumentoNoValidoEx {
        //es obligatorio -- En el segundo no es obligatorio el metodo o referencia
        List<Cuenta> lista = new LinkedList<>();
        //ArrayList<Cuenta> lista = new ArrayList<>();
        Cuenta cc0 = new CuentaCorriente(11, 22);
        Cuenta cc1 = new CuentaCorriente(2, 3);
        Cuenta cc2 = new CuentaCorriente(11, 22);
        
        lista.add(cc0);
        lista.add(cc1);
      
        



        Cuenta obtenerCuenta = (Cuenta) lista.get(0);
        //System.out.println(obtenerCuenta);

        for (int i = 0; i < lista.size(); i++ ) {
            System.out.println(lista.get(i));
        }        

        boolean contiene = lista.contains(cc2);
        
        if (contiene) {
            System.out.println("es igual (usando equals)");
        } 
    }
    
}
