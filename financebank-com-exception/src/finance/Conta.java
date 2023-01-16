package finance;

public class Conta {
	
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total = 0;
	
	public Conta(int agencia, int numero) {
		
		total++;
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("Criando uma conta");
		
	}
	
	public void deposita(double valor) {
        this.saldo = this.saldo + valor;
    }

    public void saca(double valor) throws SaldoInsuficienteException{
        if(this.saldo < valor) {
           throw new SaldoInsuficienteException("Nao e possivel realizar saque, Saldo:"+this.saldo+", Valor total:"+valor);
      
        } else {
        	 this.saldo -= valor;
        }
    }

    public void transfere(double valor, Conta destino) throws SaldoInsuficienteException {
        this.saca(valor);
        destino.deposita(valor);
        }
        
	
	public double getSaldo() {
		return this.saldo;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		if (agencia <=0) {
			System.out.println("Nao é possivel inserir valor menor ou igual a 0");
			return;
		}
		this.agencia = agencia;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int numero) {
		if (numero <=0 ) {
			System.out.println("Nao e possivel inserir valor menor ou igual a 0");
			return;
		}
		this.numero = numero;
	}
	
	public Cliente getTitular() {
		return this.titular;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public static int getTotal(){
		return Conta.total;
		
	}

}
