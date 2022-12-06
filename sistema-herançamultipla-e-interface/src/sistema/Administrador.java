package sistema;

public class Administrador extends Funcionario implements Autentica {

	private int senha;
	
	public double getBonificacao() {                  
		
		System.out.println("Chamando bonificacao do gerente");
		return 50;
	}

	@Override
	public void setSenha(int senha) {
		this.senha = senha;
		
	}

	@Override
	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		}
		return false;
	}	

}
