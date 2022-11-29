package finance;

public class TesteGerente {
	
	public static void main(String[] args) {
		
		Gerente jairoG1 = new Gerente();
		jairoG1.setNome("Jairo");
		jairoG1.setCpf("111.111.111-1");
		jairoG1.setSalario(5000);
		
		System.out.println("Nome: "+jairoG1.getNome()+"\nCPF:"+jairoG1.getCpf()+"\nSalario:"+jairoG1.getSalario());
		
		jairoG1.setSenha(1234);
		boolean autenticou = jairoG1.autentica(1234);
		System.out.println(autenticou);
	
		
		System.out.println(jairoG1.getBonificacao());
		
	}
	

}
