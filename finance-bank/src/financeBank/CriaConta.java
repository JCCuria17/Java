package financeBank;

public class CriaConta {
	
	public static void main(String[] args) {
		
		Conta contaJairo = new Conta();
		
		contaJairo.deposita(1000);
		
		contaJairo.saca(250);
		System.out.println("Saldo Jairo:"+ contaJairo.saldo);
		
		Conta contaAndresa = new Conta();
		System.out.println("saldo Adresa:"+ contaAndresa.saldo);
		
		contaJairo.transfere(500, contaAndresa);
		System.out.println("Saldo Jairo:"+contaJairo.saldo);
		System.out.println("Saldo Andresa:"+ contaAndresa.saldo);
		
		Conta contaKayk = new Conta();
		contaKayk.deposita(500);
		System.out.println("Saldo Kayk:"+ contaKayk.saldo);
		
		contaKayk.transfere(100, contaAndresa);
		System.out.println("Saldo Andresa:"+ contaAndresa.saldo+ "\nSaldo Kayk:" + contaKayk.saldo);
		
		
		
	}

}
