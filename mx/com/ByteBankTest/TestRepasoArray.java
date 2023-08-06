package mx.com.ByteBankTest;

import java.util.ArrayList;
import java.util.List;

public class TestRepasoArray {

    public static void main(String[] args) {
        
        int[] numeros = new int[10];

        //WRAPPER

        int numero = 40;
        //Integer numeroObjeto = new Integer(40);  Metodo deprecado 
        Integer numeroObjeto =  Integer.valueOf(40);

        List<Integer> lista = new ArrayList<Integer>();
        // primitivo != object
        lista.add(numero);//autoboxing
        lista.add(Integer.valueOf (40));
        lista.add(numeroObjeto);

        //unboxing
        // int valorPrimitivo = numeroObjeto;
        int valorPrimitivo = numeroObjeto.intValue();

        byte byteInteger = numeroObjeto.byteValue();
        double doubleInteger = numeroObjeto.doubleValue();
        float floatInteger = numeroObjeto.floatValue();

        System.out.println(Integer.MAX_VALUE); //   2 ^ 31 - 1
        System.out.println(Integer.MIN_VALUE); // - 2 ^ 31 

        System.out.println(Integer.SIZE);       // 32 bits
        System.out.println(Integer.BYTES);      // 4 bytes


        Integer valorReferencia = Integer.valueOf(33); //Hereda la creacion al metodo valueOF
        int valorPrimitivo2 = valorReferencia.intValue();       //Desenvolver, tomando el valor primitivo del objeto contenedor 

        System.out.println(valorPrimitivo2);

    }
}
