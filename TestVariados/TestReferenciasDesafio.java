package TestVariados;


import java.util.ArrayList;

import mx.com.ByteBankbyEmmanuel.*;

public class TestReferenciasDesafio {
    
    public static void main(String[] args) throws ArgumentoNoValidoEx {
    
        
        referencias guardador = new referencias();
        Object objeto0 = new Cliente();
        ((Cliente) objeto0).setNombre("Jose");
        guardador.guardador(objeto0);
        Object objeto1 = new Gerente();
        ((Gerente) objeto1).setNombre("Jesus");
        guardador.guardador(objeto1);
        Object objeto2 = new CuentaAhorros(1,2 );
      
        guardador.guardador(objeto2);
        Object objeto3 = new CuentaCorriente(3,4 );
        
        guardador.guardador(objeto3);
        guardador.Obtener(0);
        guardador.Obtener(1);
        guardador.Obtener(2);
        guardador.Obtener(3);

        for (int i = 0; i < guardador.indice; i++) {
            System.out.println(guardador.Obtener(i));
        }

       
        


// ESTO SE PUEDE CONVERTIR A ARRAY LIST


        // ARRAY LIST UNICAMENTE PARA CUENTAS DEFINIDO POR MI GENERIC <>

        System.out.println();
        System.out.println("Aqui Empieza la parte de abajo");
        System.out.println();

        ArrayList<Cuenta> lista = new ArrayList<Cuenta>();
        //REFERENCIA    | OBJETO -> HEAP
        Cuenta obj0 = new CuentaCorriente(1, 2);
        lista.add(obj0);        
        Cuenta obj1 = new CuentaCorriente(2, 3);
        lista.add(obj1);

        System.out.println("Tamaño de la lista; " + lista.size());
        Cuenta ref = (Cuenta) lista.get(0);
        System.out.println(ref.getnumero());

        lista.remove(0);
        System.out.println(ref.getnumero());

        Cuenta obj2 = new CuentaCorriente(3,4);
        lista.add(obj2);
        Cuenta obj3 = new CuentaAhorros(4,5);
        lista.add(obj3);
        Cuenta obj4 = new CuentaAhorros(5,6);
        lista.add(obj4);
        //FOR i
        for (int i = 0; i < lista.size(); i++) {
            Object oRef = lista.get(i);
            System.out.println(oRef);
        }

        System.out.println("-----<for each>------");
        
        for (Object oRef : lista) {
            System.out.println(oRef);
        }

       
        
    }
}
