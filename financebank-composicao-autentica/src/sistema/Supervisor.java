package sistema;

public class Supervisor extends Funcionario {
	
	public double getBonificacao() {
		
		System.out.println("Chamando bonificacao do supervisor");
		return 100;
	}

}
