package carros;

public class Carro {

	private int ano;
	private String modelo;
	private double preco;
	
	public Carro(int ano, String modelo, double preco) {
		if (ano > 1891) {
		this.ano = ano;
		}else {
			System.out.println("O ano informado esta invalido");
			this.ano = 2017;
		}
		if (modelo != null) {
		this.modelo = modelo;
		}else {
			System.out.println("O modelo não foi informado");
			this.modelo = "Gol";
		}
		if (preco > 0) {
		this.preco = preco;
		}else { 
			System.out.println("O preco nao foi informado");
			this.preco = 35000;
		}
		
	}
	// Aplicando a mesma regra de negocio do primeiro construtor no segundo e definindo um valor fixo no atributo
	public Carro( String modelo, double preco) {    
		this (2017, modelo, 40000);
		
	}
	
	public int getAno() {
		return this.ano;
		
	}
	
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public String getModelo() {
		return this.modelo;
	}
	
	public void setModelo( String modelo) {
		this.modelo = modelo;
		}
	public double getPreco() {
		return this.preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
		
	}
}
