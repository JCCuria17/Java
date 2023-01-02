package sistema;

// a classe que implementar interface é obrigado a implementar metodo setSenha e autentica
public abstract interface Autentica {

	public abstract void setSenha(int senha);
	
	public abstract boolean autentica(int senha);
}
