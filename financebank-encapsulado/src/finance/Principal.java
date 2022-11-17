package finance;

public class Principal {
	
	public static void main(String[] args) {
		
		
		Cliente jairo = new Cliente();
		jairo.setCpf("111.111.111-11");
		jairo.setNome("Jairo Cesar");
		jairo.setProfissao("Programador");
		
		Conta contaJairo = new Conta();
		contaJairo.deposita(500);
		contaJairo.setTitular(jairo);
		
		System.out.println("Cliente:"+ contaJairo.getTitular().getNome()+ "   Saldo:"+ contaJairo.getSaldo()+ "   Profissao:"+contaJairo.getTitular().getProfissao());
				
		contaJairo.getTitular().setProfissao("Analista");//primeiro metodo para alterar informação
		
		System.out.println("Profissao de "+ contaJairo.getTitular().getNome()+ " alterado para "+ contaJairo.getTitular().getProfissao()); 
		
		Cliente jairoProfissao = contaJairo.getTitular();// segundo metodo para alterar informação
				
		jairoProfissao.setProfissao("Programador");
		
		System.out.println("Profissao de "+contaJairo.getTitular().getNome()+ " alterado para "+jairoProfissao.getProfissao());
		
		// impressão para mostrar que são as mesmas referências na memoria
		System.out.println(contaJairo.getTitular());
		System.out.println(jairoProfissao);
		
		
	}

}
