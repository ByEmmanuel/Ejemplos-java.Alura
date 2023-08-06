package mx.com.ByteBankTest;

import java.lang.reflect.Array;

import mx.com.ByteBankbyEmmanuel.ArgumentoNoValidoEx;
import mx.com.ByteBankbyEmmanuel.CuentaCorriente;

public class Testmain {
    
    public static void main(String[] args) throws ArgumentoNoValidoEx {
    
        int[] edades = new int[6];

        edades [2] = 20;
        System.out.println(edades[1]);
        System.out.println(edades[2]);

        int tamañoArray = edades.length;
        System.out.println(tamañoArray);
        for (int i = 0; i < tamañoArray; i++){
            System.out.println(edades[i]);
        }



        CuentaCorriente cc = new CuentaCorriente(1, 2);


        CuentaCorriente[] cuentas = new CuentaCorriente[5];
        cuentas[1] = cc ;

        System.out.println(cc);
        System.out.println(cuentas[1]);

        cuentas[0] = new CuentaCorriente(11, 22);
        
        for (int i = 0 ; i < cuentas.length; i++) {
            System.out.println(cuentas[4]);
        }

    }

}
