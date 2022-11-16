package finance;

public class testaBanco {
	public static void main(String[] args) {
		
		//inicianlizando as classes
	Cliente jairo = new Cliente();
	jairo.nome = "Jairo Cesar";
	jairo.cpf = "111.111.111-11";
	jairo.profissao = "Programador";
	
	Conta contaJairo = new Conta();
	
	contaJairo.titular = jairo;			// associando cliente Jairo com a contaJairo
	contaJairo.deposita(500);
	System.out.println("Titular:"+ contaJairo.titular.nome+" Saldo:"+contaJairo.saldo);
	
	Cliente andresa = new Cliente();
	
	andresa.nome = "Andresa Santos";
	andresa.cpf = "222.222.222-22";
	andresa.profissao = "Assistente de RH";
	
	Conta contaAndresa = new Conta();
	contaAndresa.titular = andresa;        //associando cliente Andresa com a contaAndresa
	contaAndresa.deposita(600);
	System.out.println("Titular:"+contaAndresa.titular.nome+" Saldo:"+contaAndresa.saldo);
	
	
	contaJairo.transfere(200,contaAndresa);
	System.out.println("Titular:"+ contaJairo.titular.nome+" Saldo:"+contaJairo.saldo+ "\nTitular:"+contaAndresa.titular.nome+" Saldo:"+contaAndresa.saldo);
	
	
	}
	

}
