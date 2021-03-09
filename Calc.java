package aula08032021;

public class Calculadora {

	public static void main(String[] args) {
		
		
		Calculadora.soma(5.3, 4.7);
		Calculadora.subtracao(5.0, 4.0);
		Calculadora.multiplicacao(4.8, 8.9);
		Calculadora.divisao(6.2, 3.6);

	}
	
	
	public static void soma(Double n1, Double n2) {
		
		Double soma = n1 + n2;
		System.out.println("Soma: " + soma);	
	}
	
	public static void subtracao(Double n1, Double n2) {
		
		Double subtracao = n1 - n2;
		System.out.println("Subtracao: " + subtracao);	
	}
	
	public static void multiplicacao(Double n1, Double n2) {
		
		Double multiplicacao = n1 * n2;
		System.out.println("Multiplicacao: " + multiplicacao );	
	}
	
	public static void divisao(Double n1, Double n2) {
		
		Double divisao = n1 / n2;
		System.out.println("Divisao: " + divisao);	
	}
	

}
