package calculadora;

import calculadora.impl.CalculadoraImpl;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Calculadora calculadora = new CalculadoraImpl();
		int option, a, b;
		double result = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("=========== CALCULADORA ========");
		System.out.println("SOMAR - 1");
		System.out.println("SUBTRAIR - 2");
		System.out.println("DIVIDIR - 3");
		System.out.println("MULTIPLICAR - 4");
		System.out.print("Escolha a operação: ");
		option = sc.nextInt();
		System.out.println("Insira o valor de A: ");
		a = sc.nextInt();
		System.out.println("Insira o valor de B: ");
		b = sc.nextInt();
		switch (option){
			case 1:
				result = calculadora.getSoma(a, b);
				break;
			case 2:
				result = calculadora.getSubtracao(a, b);
				break;
		}
		System.out.printf("O resultado da operação é: %.2f", result);

	}

}
