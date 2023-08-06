package Excepciones;

public class Conexion implements AutoCloseable{
 
    public Conexion(){
        System.out.println("Abriendo Conexion");
            throw new IllegalArgumentException();
    }

    public void leerdatos(){
        System.out.println("Recibiendo datos");
        
    }

    public void cerrar(){
        System.out.println("Cerrando conexion");
    }

    @Override
    public void close() throws Exception {
       cerrar();
    }






}

