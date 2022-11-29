package finance;

public class TesteFuncionario {
	
	public static void main(String[] args) {
		
		Funcionario maria = new Funcionario();
		maria.setNome("Maria");
		maria.setCpf("123.456.789-1");
		maria.setSalario(1500);
		
		System.out.println("Nome:"+maria.getNome()+"\nCPF:"+maria.getCpf()+"\nSalario:"+maria.getSalario()+"\nBonificacao:"+maria.getBonificacao());
	}

}
