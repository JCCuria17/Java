package sistema;

public class Administrador extends Funcionario implements Autentica {

	private AutenticacaoUtil autenticador;
	
	public Administrador() {
		this.autenticador = new AutenticacaoUtil();
	}
	
	public double getBonificacao() {                  
		
		System.out.println("Chamando bonificacao do gerente");
		return 50;
	}

	
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
		
	}

	
	public boolean autentica(int senha) {
		boolean autenticou = this.autenticador.autentica(senha);
		return autenticou;
	}	

}
