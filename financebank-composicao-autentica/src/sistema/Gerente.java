package sistema;

public class Gerente extends Funcionario implements Autentica{
	
	private AutenticacaoUtil autenticador;
	
	public Gerente() {
		this.autenticador = new AutenticacaoUtil();
	}

	public double getBonificacao() {                  
		
		System.out.println("Chamando bonificacao do gerente");
		return super.getSalario();
	}

	
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
		
	}

	
	public boolean autentica(int senha) {
		boolean autenticou = autenticador.autentica(senha);
		return autenticou;
		}
	}


