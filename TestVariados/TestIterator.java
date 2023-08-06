package TestVariados;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;

public class TestIterator {
    

    public static void main(String[] args) {
        


        List <String> nombres = new ArrayList<>();
        nombres.add("Jose");
        nombres.add("PEpe");
        nombres.add("Juan");
        nombres.add("lui");

        Iterator<String> it = nombres.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("----div----");

        //Recordando que set es referencia al ingles de "PONER" en español
        Set<String> nombres1 = new HashSet<>();
        nombres1.add("Li");
        nombres1.add("Lopez");
        nombres1.add("garcia");
        nombres1.add("BY");

        Iterator<String> iterador = nombres.iterator();

        while(iterador.hasNext()){
            System.out.println(iterador.next());
        }
       

// otra forma de ordenar listas
System.out.println("-- Otra forma de ordenar listas--");


        class Persona {
            String nombre;
            int edad;
        
            public Persona(String nombre, int edad) {
                this.nombre = nombre;
                this.edad = edad;
            }
        }
    


        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Alice", 30));
        personas.add(new Persona("Bob", 25));
        personas.add(new Persona("Charlie", 40));

        // Ordenar por edad utilizando un comparador personalizado
        Collections.sort(personas, new Comparator<Persona>() {
            @Override
            public int compare(Persona p1, Persona p2) {
                return Integer.compare(p1.edad, p2.edad);
            }
        });

        // Imprimir el resultado ordenado
        for (Persona persona : personas) {
            System.out.println(persona.nombre + ": " + persona.edad);
        }


    }
}
