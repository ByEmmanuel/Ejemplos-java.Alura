package Excepciones;

public class TestConexion {

    public static void main(String[] args) throws Exception {
       
        try (Conexion con = new Conexion()) {
            con.leerdatos(); 
        } catch(IllegalStateException ex){
            System.out.println("Ejecutando catch");
            ex.printStackTrace();
        }


        /*
        Conexion con = new Conexion();
        try {
            con.leerdatos();
            
        } catch (IllegalStateException e) {
            System.out.println("Recibiendo excepcion");
            e.printStackTrace();
        }finally{
            System.out.println("Ejecutando Finally");
            con.cerrar();
        }

        */

    }


    
}
