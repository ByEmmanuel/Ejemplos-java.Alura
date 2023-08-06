package mx.com.ByteBankTest;

public class TestWrappers {

    public static void main(String[] args) {
        
        Double numeroDoble = 33.0; //autoboxing
        Boolean verdadero = true; //autoboxin

        Double numeroDoble2 = Double.valueOf(33);
        System.out.println(numeroDoble2);

        String numeroString = "2";

        Double stringToDouble = Double.valueOf(numeroString);
        Integer stringToInteger = Integer.valueOf(numeroString);

        System.out.println(stringToDouble);
        System.out.println(stringToInteger);

        Number numero = Integer.valueOf(2);
        Double numeroDoublePrim = numero.doubleValue();

        Boolean falso = Boolean.FALSE;
        


    }
    
}
