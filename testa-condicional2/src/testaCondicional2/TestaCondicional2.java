package testaCondicional2;

public class TestaCondicional2 {
	
	public static void main(String[] args) {
		
        System.out.println("testando condicionais");

        int idade = 16;
        int quantidadePessoas = 1;        

        if (idade >=18 || quantidadePessoas >=2){    // condicionais com operador lógico
            System.out.println("Seja bem vindo");   
        } else {
            System.out.println("infelizmente voce nao pode entrar");
        }
		
	}

}
