package finance;

public class Principal {

	public static void main(String[] args) {
		
		Conta conta1 = new Conta(12,1234);
		Conta conta2 = new Conta(12, 4321);
		System.out.println("Agencia:"+conta1.getAgencia()+" numero:"+conta1.getNumero());
		System.out.println("Agencia:"+conta2.getAgencia()+" numero:"+conta2.getNumero());
		System.out.println("Total de contas:"+Conta.getTotal());
		
		conta1.setAgencia(-22);
		System.out.println(conta1.getAgencia());
		
		conta2.setNumero(00000);
		System.out.println(conta2.getNumero());
		
		
	}
	
}
