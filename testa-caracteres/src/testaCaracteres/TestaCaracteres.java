package testaCaracteres;

public class TestaCaracteres {

	public static void main(String[] args) {

        char letra = 'a';                 //teste com variável do tipo char
        System.out.println(letra);

        char valor = 65;                  //tipo char só imprime 1 caracter, então mesmo atribuindo valores numéricos ele busca na tabela o caracter correspondente e imprime
        System.out.println(valor);
        
        valor = (char) (valor + 1); 
        System.out.println(valor);
        
        String palavra = "Teste Variavel String";
        System.out.println(palavra);

        palavra = palavra + 2020;    //concatenação de variáveis
        System.out.println(palavra);


	}

}
