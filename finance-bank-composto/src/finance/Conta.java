package finance;

public class Conta {
	
	double saldo;
	int agencia;
	int numero;
	Cliente titular;
	
	
	public void deposita(double valor){
		
		this.saldo += valor;
		
	}
	
	public boolean saca (double valor) {
		
		if (saldo >= valor) {
			this.saldo -= valor;
			System.out.println("Operação realizada com sucesso.");
			return true;
			
		}else {
			System.out.println("Saldo insuficiente para realizar esta operação");
		return false;
		}
	}
	
	public boolean transfere(double valor,Conta contaDestino) {
		if (saldo >= valor) {
			this.saldo -= valor;
			contaDestino.saldo += valor;
			System.out.println("Transferencia realizada com sucesso");
			return true;
			
		}else {
			System.out.println("Saldo insuficiente para realizar esta operação.");
			return false;
		}
	}


}
