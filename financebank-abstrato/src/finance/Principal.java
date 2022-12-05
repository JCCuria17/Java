package finance;

public class Principal {

	public static void main(String[] args) {
		
		Gerente g1 = new Gerente();
		g1.setNome("Jairo");
		g1.setSalario(5000);
		
		Cordenador c1 = new Cordenador();
		c1.setNome("Luke");
		c1.setSalario(3000);
		
		Supervisor s1 = new Supervisor();
		s1.setNome("Neil");
		s1.setSalario(2500);
		
		
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		controle.registra(c1);
		controle.registra(s1);
		
		
		System.out.println(controle.getSoma());

	}

}
