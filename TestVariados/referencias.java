package TestVariados;

import mx.com.ByteBankbyEmmanuel.*;

public class referencias {
    
    Object[] objects = new Object[10];

    int indice = 0;

    
    public void guardador(Object cc) {
        objects[indice] = cc;
        indice++;
    }


    public Object Obtener(int indice){
        return objects[indice];
    }


}
