package TestVariados;

public class TestDesafioBuzz  {
    
    public static void main(String[] args)  {
        
        int cero = 0;
        if (cero == 10) {
           
             throw new RuntimeException();
        } else {
            System.out.println("e");
        }
    
    String[] numeros = new String[101];
    

        for (int i = 0; i < numeros.length; i++) {
        
        int numero = i + 1;

        if (numero % 15 == 0  ) {
                numeros[i] = "fizzBuzz"; 
        
        }else if (numero % 3 == 0) {
                numeros[i] = "fizz"; 
        }else if (numero % 5 == 0){
                numeros[i] = "buzz";
        
        }else{ numeros[i] = Integer.toString(numero);
        }
    }
    for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);

            
        }
        
        

    }
}
