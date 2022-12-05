package finance;

public class Principal {

	public static void main(String[] args) {

		ContaCorrente cc = new ContaCorrente(111, 111);
		ContaPoupanca cp = new ContaPoupanca(222, 222);
		
		cc.deposita(100.0);
		cp.deposita(100.0);
		System.out.println("CC: " +cc.getSaldo()+ " CP: "+cp.getSaldo());
		
		cc.saca(20);
		
		System.out.println("CC: " +cc.getSaldo()+ " CP: "+cp.getSaldo());
		
		cp.saca(10);
		
		System.out.println("CC: " +cc.getSaldo()+ " CP: "+cp.getSaldo());
		
	}

}
