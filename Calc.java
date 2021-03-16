import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) 
	{
		
		Scanner le = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número inteiro");
		Integer numero1 = le.nextInt();
		System.out.println("Digite o segundo número inteiro");
		Integer numero2 = le.nextInt();
		
		le.close();
		
		Integer soma = soma(numero1, numero2);
		Integer sub = sub(numero1, numero2);
		Integer mult = mult(numero1, numero2);
		Integer div = div(numero1, numero2);
		
		System.out.println(numero1 + " + " + numero2 + " = " + soma);
		System.out.println(numero1 + " - " + numero2 + " = " + sub);
		System.out.println(numero1 + " * " + numero2 + " = " + mult);
		System.out.println(numero1 + " / " + numero2 + " = " + div);
	}
	
	public static Integer soma(Integer n1, Integer n2) {
		
		return n1 + n2;
		
		
	}
	
	public static Integer sub(Integer n1, Integer n2) {
		
		return n1 - n2;
		
		
	}
	
	public static Integer mult(Integer n1, Integer n2) {
		
		return n1 * n2;
		
		
	}
	
	public static Integer div(Integer n1, Integer n2) {
		
		return n1 / n2;
		
		
	}
}
