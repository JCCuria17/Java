package carros;

public class Principal {

	public static void main(String[] args) {

		Carro carro = new Carro(2000, "gol",20000);
		System.out.println("Ano:"+carro.getAno()+"\nModelo:"+ carro.getModelo()+"\nPreco:"+ carro.getPreco());
		
		Carro carro2 = new Carro("Up", 0);
		System.out.println("Ano:"+carro2.getAno()+"\nModelo;"+carro2.getModelo()+"\nPreco:"+carro2.getPreco());
		
		

	}

}
