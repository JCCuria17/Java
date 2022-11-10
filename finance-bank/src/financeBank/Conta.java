package financeBank;

public class Conta {

	double saldo;
	int agencia;
	int numero;
	String titular;
	
	public void deposita(double valor) {
		this.saldo += valor;
		System.out.println("Valor "+valor +" depositado com sucesso");
		
	}
	public boolean saca(double valor) {
		
		if (this.saldo >= valor) {
			System.out.println("Saque "+valor+" realizado com sucesso");
			this.saldo -= valor;
			System.out.println("Saldo atual: "+ this.saldo);
			System.out.println("------------------------------------------------");
			return true;
		}else {
			System.out.println("Saldo insuficiente para realizar saque");
			System.out.println("------------------------------------------------");
			return false;
		}
	}
		
		public boolean transfere(double valor, Conta contaDestino) {
			if (this.saldo >= valor) {
				this.saldo -= valor;
				contaDestino.saldo += valor;
				System.out.println("Transferencia realizada com sucesso");
				return true;
				
			}else {
				System.out.println("Valor de transferencia maior do que saldo atual.");
				return false;
			}
			
		}
		
	
	
}
