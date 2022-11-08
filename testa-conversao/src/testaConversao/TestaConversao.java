package testaConversao;

public class TestaConversao {
	
    public static void main(String[] args){
    	
    	float pontoFlutuante = 3.14f; //aqui é usado o "f" para dizer que é uma variavel do tipo float

        double salario = 1270.50;
        int valor = (int) salario;  //aqui é feito um casting para conversão de double para int
        
        System.out.println(valor);
        
        double valor1 = 0.2;
        double valor2 = 0.1;
        double total = valor1 + valor2;

        System.out.println(total);
    }

}
