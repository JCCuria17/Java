package sistema;

public class Gerente extends Funcionario implements Autentica{
	
	private int senha;

	public double getBonificacao() {                  
		
		System.out.println("Chamando bonificacao do gerente");
		return super.getSalario();
	}

	@Override
	public void setSenha(int senha) {
		this.senha = senha;
		
	}

	@Override
	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		}else {
			return false;
		}
	}

}
