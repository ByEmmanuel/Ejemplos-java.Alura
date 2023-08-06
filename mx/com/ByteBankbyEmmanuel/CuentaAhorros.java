package mx.com.ByteBankbyEmmanuel;

public class CuentaAhorros extends Cuenta{
    
    @Override
    public String toString(){
        return "Esta es una cuenta del tipo Ahorros. " + getAgencia() + " Y numero; " + getnumero() + " Titular; " + getTitular().getNombre();
    }

    public CuentaAhorros(int agencia, int numero) throws ArgumentoNoValidoEx{
        super(agencia, numero);
    }

    @Override
    public void depositar(double valor){
        super.saldo += valor;
    }
}
