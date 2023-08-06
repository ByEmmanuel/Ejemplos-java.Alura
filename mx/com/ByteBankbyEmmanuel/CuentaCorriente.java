package mx.com.ByteBankbyEmmanuel;

public class CuentaCorriente extends Cuenta {

    @Override
    public String toString(){
        return "Esta es una cuenta del tipo Corriente. " + getAgencia() + " Y numero; " + getnumero()+" Titular; " + getTitular().getNombre();
    }
    
    public CuentaCorriente(int agencia, int numero) throws ArgumentoNoValidoEx{
        super(agencia, numero);
    }

    
    @Override
	public void retirar(double valor)throws ArgumentoNoValidoEx {
        double comision = 0.2;
        super.retirar(valor + comision);
        this.saldo = Math.round(this.saldo * 100.0) / 100.0; // Redondear a dos decimales
		
	}

    
    @Override
    public void depositar(double valor){
        super.saldo += valor;
    }





    
// agregar ganancias banco con una nueva clase
}
