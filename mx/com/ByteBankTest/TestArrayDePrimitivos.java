package mx.com.ByteBankTest;

public class TestArrayDePrimitivos {
    
    public static void main(String[] args) {
        
        int[] edades = new int [5];

        edades[0] =  29;
        edades[1] =  39;
        edades[2] =  49;
        edades[3] =  59;
        edades[4] =  69;

        int edad4 = edades[3];

        //System.out.println(edad4);

        // Tamaño de mi array edades
        //System.out.println(edades.length);

        int[] edades2 = new int[5];

        for (int i = 0; i < edades2.length; i++){
            edades2[i] = i * i;
        }

        /**
         *   Envez de nombre se usa mas facil la letra i por convencion
         * 
         *   for (int i = 0; i < edades2.length; i++){
         *   edades2[i] = i * i + i;
         *   System.out.println(edades2[i]);
         *   }
         * 
         */

        // NOMBRE DE LA VARIABLE = NDLV
        //     NDLV inicializando con 0 
        //                      length pasa por el NDLV.  y cada vez que pasa otra vez, aumenta en 1 el lugar del array en este caso
        for (int lugardelarray = 0; lugardelarray < edades2.length; lugardelarray++){
            //NDLV en el lugar del array * POR el lugar del mismo array, (+2 en este caso para aumentar 2 en el resultado de consola)
            edades2[lugardelarray] = lugardelarray * lugardelarray + lugardelarray;
            // Devuelve el valor de la posicion del array (NDLV) ya multiplicado y sumado 
            System.out.println(edades2[lugardelarray]);
        }


    }


}
