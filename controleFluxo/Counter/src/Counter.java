package application;

import java.util.Scanner;

public class Counter {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o primeiro parâmetro: ");
		int parametroUm = sc.nextInt();

		System.out.print("Digite o segundo parâmetro: ");
		int parametroDois = sc.nextInt();
		
		try {
			contar(parametroUm, parametroDois);
		} catch (InvalidParametersException e) {
			System.out.println(e.getMessage());
		}
	}
	
	static void contar(int parametroUm, int parametroDois ) throws InvalidParametersException {
		//Validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		if(parametroUm>parametroDois) {
			throw new InvalidParametersException("O segundo parâmetro deve ser maior que o primeiro.");
		}
		
		//Imprimir os números com base na variável contagem
		int contagem = parametroDois - parametroUm;
		for(int i=1; i <= contagem; i++) {
			System.out.println("Imprimindo o número " + i);
		}
	}
}