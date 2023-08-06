package mx.com.ByteBankTest;

import java.util.ArrayList;

import mx.com.ByteBankbyEmmanuel.ArgumentoNoValidoEx;
import mx.com.ByteBankbyEmmanuel.Cuenta;
import mx.com.ByteBankbyEmmanuel.CuentaCorriente;
import mx.com.ByteBankbyEmmanuel.GuardaCuentas;

public class TestGuardaCuentas {

    public static void main(String[] args) throws ArgumentoNoValidoEx {
        
        GuardaCuentas guardaCuentas = new GuardaCuentas();
        Cuenta cc = new CuentaCorriente(1, 2);
        guardaCuentas.adiciona(cc);
        Cuenta cc2 = new CuentaCorriente(3, 3);
        guardaCuentas.adiciona(cc2);

        guardaCuentas.Obtener(1);
        System.out.println(guardaCuentas.Obtener(0));
        System.out.println(guardaCuentas.Obtener(1));

        

    }
    
}
