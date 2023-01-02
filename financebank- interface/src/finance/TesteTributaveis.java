package finance;

public class TesteTributaveis {
	
	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(222, 333);
		cc.deposita(100);
		
		SeguroDeVida seguro = new SeguroDeVida();
		
		CalculardorImposto cal = new CalculardorImposto();
		
		cal.registro(cc);
		cal.registro(seguro);
		
		System.out.println(cal.getTotalImposto());
		
	}

}
