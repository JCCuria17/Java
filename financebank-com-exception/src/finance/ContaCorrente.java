package finance;

public class ContaCorrente extends Conta {
	
	public ContaCorrente(int agencia, int numero){
		super(agencia, numero);
	}
	
	@Override
	public void saca(double valor) throws SaldoInsuficienteException{
	    double valorASacar = valor + 0.2;
	    super.saca(valorASacar);
	}
}
