package mx.com.ByteBankTest;

import java.util.*;

import mx.com.ByteBankbyEmmanuel.*;

public class TestOrdenarLista {

    public static void main(String[] args)throws ArgumentoNoValidoEx {
        
        Cuenta cc1 = new CuentaCorriente(2, 33);
        Cliente clienteCC1 = new Cliente();
        clienteCC1.setNombre("Diego");
        cc1.setTitular(clienteCC1);
        cc1.depositar(333.0);
    
        Cuenta cc2 = new CuentaAhorros(35, 44);
        Cliente clienteCC2 = new Cliente();
        clienteCC2.setNombre("Renato");
        cc2.setTitular(clienteCC2);
        cc2.depositar(444.0);
    
        Cuenta cc3 = new CuentaCorriente(85, 11);
        Cliente clienteCC3 = new Cliente();
        clienteCC3.setNombre("Liam");
        cc3.setTitular(clienteCC3);
        cc3.depositar(111.0);
    
        Cuenta cc4 = new CuentaAhorros(20, 22);
        Cliente clienteCC4 = new Cliente();
        clienteCC4.setNombre("Noel");
        cc4.setTitular(clienteCC4);
        cc4.depositar(222.0);
        
        List<Cuenta>  lista = new ArrayList<>();
        lista.add(cc1);
        lista.add(cc2);
        lista.add(cc3);
        lista.add(cc4);
    

        System.out.println("---Antes de ordenar---");
        for (Cuenta cuenta : lista) {
            System.out.println(cuenta);
        }


        // Ordenar las cuentas
        //          Cualquier clase hija de Cuenta
        // Comparator <? extend Cuenta> c

        // Una forma 
        //Comparator<Cuenta> comparator = new OrdenadorPorNumeroCuenta(); // implementacion de la interfaz
        //lista.sort(comparator);

        // Otra forma
        lista.sort(new Comparator<Cuenta>() {

            @Override
            public int compare(Cuenta o1, Cuenta o2) {
               return Integer.compare(o1.getnumero(), o2.getnumero());
            }
            
        });

        System.out.println("---Despues de ordenar por numero de cuenta---");
        for (Cuenta cuenta : lista) {
            System.out.println(cuenta);
        }

       

        // Comparator<Cuenta> comparatorNombreTitular = new OrdenadorPorNombreTitular();
        // lista.sort(comparatorNombreTitular);
        //lista.sort(new OrdenadorPorNumeroCuenta());

        System.out.println("---Despues de ordenar por nombre---");
        

        //Collections.sort(lista, new OrdenadorPorNombreTitular());
        Collections.sort(lista, new Comparator<Cuenta>() {

            @Override
            public int compare(Cuenta o1, Cuenta o2) {
                 return o1.getTitular().getNombre().compareTo(o2.getTitular().getNombre());
            }

        });
        for (Cuenta cuenta : lista) {
            System.out.println(cuenta);
        }

        System.out.println("---Despues de ordenar por saldo---");
        

        Collections.sort(lista, new OrdenadorPorSaldo());
        for (Cuenta cuenta : lista) {
            System.out.println(cuenta);
        }
    }
    
}

// Entidad o objeto 
class OrdenadorPorNumeroCuenta implements Comparator<Cuenta>{

    @Override
    public int compare(Cuenta o1, Cuenta o2){
    // Forma Basica 
        // if(o1.getnumero() ==  o2.getnumero()){
        //     return 0;
        // }else if (o1.getnumero() >  o2.getnumero()){
        //     return 1;
        // }else{
        //     return -1;
        // }
    // Forma Intermedia
        //return o1.getnumero() - o2.getnumero();
    // Forma Wrapper
    return Integer.compare(o1.getnumero(), o2.getnumero());
    }


}
        
class OrdenadorPorNombreTitular implements Comparator<Cuenta>{

    @Override
    public int compare(Cuenta o1, Cuenta o2){
        return o1.getTitular().getNombre().compareTo(o2.getTitular().getNombre());

    }

}

class OrdenadorPorSaldo implements Comparator<Cuenta>{

    @Override
    public int compare(Cuenta o1, Cuenta o2){
        return Double.compare(o1.getSaldo(), o2.getSaldo());
    }

}
 
        

 


