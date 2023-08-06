package mx.com.ByteBankbyEmmanuel;

public class GuardaCuentas {
    

    // Crear un objeto para guardar muchas cuentas
    // Permitirnos agregar cuentas con un metodo 
    // Guardacuentas.adiciona(Cuentas);
    // Obtener, remover, etc

    Cuenta[] cuenta = new Cuenta[10];

    int indice = 0;

    public void adiciona(Cuenta cc) {
        cuenta[indice] = cc;
        indice++;
    }


    public Cuenta Obtener(int indice){
        return cuenta[indice];
    }
}
