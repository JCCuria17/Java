package finance;

public class Cordenador extends Funcionario {
	
	public double getBonificacao() {
		
		System.out.println("Chamando bonificacao do cordenador");
		return super.getBonificacao() + 200; 
	}

}
