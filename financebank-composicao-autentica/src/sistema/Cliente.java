package sistema;

public class Cliente implements Autentica{
	
	private AutenticacaoUtil autenticador;
	
	public Cliente() {
		this.autenticador = new AutenticacaoUtil();
	}
	
	
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
		
	}

	
	public boolean autentica(int senha) {
		
		boolean autenticou = this.autenticador.autentica(senha);
		return autenticou;
		}
		
		


}
