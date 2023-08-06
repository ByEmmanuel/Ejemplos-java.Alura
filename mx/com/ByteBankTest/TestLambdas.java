package mx.com.ByteBankTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import mx.com.ByteBankbyEmmanuel.ArgumentoNoValidoEx;
import mx.com.ByteBankbyEmmanuel.Cliente;
import mx.com.ByteBankbyEmmanuel.Cuenta;
import mx.com.ByteBankbyEmmanuel.CuentaAhorros;
import mx.com.ByteBankbyEmmanuel.CuentaCorriente;

public class TestLambdas {
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

        lista.sort((Cuenta o1, Cuenta o2) -> 
            Integer.compare(o1.getnumero(), o2.getnumero())
        );

        System.out.println("---Despues de ordenar por numero de cuenta---");
        for (Cuenta cuenta : lista) {
            System.out.println(cuenta);
        }
        System.out.println("---Despues de ordenar por nombre (D, L, N, R)---");
        

        
        Collections.sort(lista, (Cuenta o1, Cuenta o2) -> {
                 return o1.getTitular().getNombre().compareTo(o2.getTitular().getNombre());
            }
        );
        // for (Cuenta cuenta : lista) {
        //     System.out.println(cuenta);
        // }
        lista.forEach(Cuenta -> System.out.println(Cuenta));

        System.out.println("---Despues de ordenar por saldo---");
        

        Collections.sort(lista, new OrdenadorPorSaldo());
        for (Cuenta cuenta : lista) {
            System.out.println(cuenta);
        }
    }
    
}

