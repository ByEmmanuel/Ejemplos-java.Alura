package mx.com.ByteBankbyEmmanuel;

public abstract class Cuenta{

    protected double saldo;
    private int agencia;
    private int numero;
    private Cliente titular = new Cliente();
    public int getSaldo;

      
    private static int total;
    

        //Constructor
    public Cuenta() {
    	
    }

    public Cuenta(int agencia, int numero)throws ArgumentoNoValidoEx{
        if (agencia <= 0){
            throw new ArgumentoNoValidoEx();
        }else{
            this.agencia = agencia;
            this.numero = numero;
        }
        Cuenta.total = Cuenta.this.numero;
        
        System.out.println("Aqui se crea la cuenta con agencia: " + Cuenta.this.agencia + " Y numero; " + getTotal() + " Titular; " + getTitular().getNombre());
    } 
    

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    //no retorna valor
    public abstract void depositar(double valor);
      
    
    
    public void retirar(double valor) throws ArgumentoNoValidoEx{
        if (this.saldo < valor ) {

            throw new ArgumentoNoValidoEx("Saldo disponible; " +  this.saldo + ". saldo a retirar; " + valor);
        }
        this.saldo -= valor;
        System.out.println("Saldo retirado; " + valor);    
        
    }
    public boolean transferir(double valor, Cuenta destino)throws ArgumentoNoValidoEx{
        if(this.saldo >= valor){
                this.retirar(valor);
            destino.depositar(valor);
            System.out.println("Nuevo saldo en la cuenta; " + this.saldo );
            return true;            
        }else{
             throw new ArgumentoNoValidoEx("Saldo disponible; " +  this.saldo + ". saldo a transferir; " + valor);

        }
        
    }
    
    
    
    public int getnumero(){
        return this.numero;
    }
    
    public void setnumero(int numero){
        if (numero > 0){
            this.numero = numero;
        }
    }
    
    public void setAgencia(int agencia) {
        if (agencia > 0 ){
            this.agencia = agencia;
        }else{
            System.out.println("No estan permitidos valores negativos");
        }
    }
    public int getAgencia(){
        return agencia;
    }
    
    public void setSaldo(int valor) {
        this.saldo = valor;
    }
    
    public double getSaldo(){
        return this.saldo;
    }

    public static int getTotal(){
        return Cuenta.total;
    }

    public void saldoDespues(){
        System.out.println(this.saldo );
    }
    
    

    @Override
    public boolean equals(Object obj){
        Cuenta cuenta = (Cuenta) obj;
        return this.agencia == cuenta.getAgencia() && this.numero == getnumero();
    }
}
