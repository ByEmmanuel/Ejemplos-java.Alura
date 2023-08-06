package mx.com.ByteBankTest;

import mx.com.ByteBankbyEmmanuel.*;
public class TestControlBonificacion {
    
    public static void main(String[] args) {


        Funcionario Emmanuel  = new Contador();
        Emmanuel.setSalario(2000);

        Gerente jimena = new Gerente();
        jimena.setSalario(10000 );

        Contador alexiz = new Contador();
        alexiz.setSalario(5000);

        ControlBonificacion controlBonificacion = new ControlBonificacion();

        controlBonificacion.registrarSalario(Emmanuel);
        controlBonificacion.registrarSalario(jimena);
        controlBonificacion.registrarSalario(alexiz);
    }
}
