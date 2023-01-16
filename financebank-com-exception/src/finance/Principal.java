package finance;

public class Principal {

	public static void main(String[] args) {

		ContaCorrente cc = new ContaCorrente(111, 111);
		cc.deposita(100);
		System.out.println("Saldo:"+cc.getSaldo());
		try {
			cc.saca(150);
		} catch (SaldoInsuficienteException ex) {
			
			System.out.println("Ex:"+ ex.getMessage());
		}
		System.out.println("Saldo atual da conta:"+cc.getSaldo());
		
	}

}
