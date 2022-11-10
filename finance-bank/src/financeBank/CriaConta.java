package financeBank;

public class CriaConta {
	
	public static void main(String[] args) {
		
		Conta primeiraConta = new Conta();
		
		primeiraConta.saldo = 200;
		System.out.println("o saldo da primeira conta e:"+ primeiraConta.saldo);
		
		primeiraConta.saldo += 100;
		System.out.println("saldo atualizado da primeira conta:"+ primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta;  // é possivel criar uma segunda referencia para a mesma conta
		segundaConta.saldo = 50;
		System.out.println("primeira conta:"+ primeiraConta.saldo);
		System.out.println("segunda conta:"+ segundaConta.saldo);
	}

}
