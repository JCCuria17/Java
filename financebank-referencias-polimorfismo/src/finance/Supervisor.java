package finance;

public class Supervisor extends Funcionario {
	
	public double getBonificacao() {
		
		System.out.println("Chamando bonificacao do supervisor");
		return super.getBonificacao() + 100;
	}

}
