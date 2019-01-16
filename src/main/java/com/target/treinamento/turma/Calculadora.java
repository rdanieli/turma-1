package com.target.treinamento.turma;

import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args) {

		Calculadora minhaCalculadora = new Calculadora();
		
		
		Double primeiroNumero = minhaCalculadora.leiaPrimeiraEntrada();
		Double segundoNumero = minhaCalculadora.leiaSegundaEntrada();
		Integer operacao = minhaCalculadora.leiaOperacao();


		Double resultado = minhaCalculadora.calcula(primeiroNumero, segundoNumero, operacao);
		System.out.println("O resultado é = " + resultado);
	}

	private Double calcula(Double primeiroNumero, Double segundoNumero, Integer operacao) {
		if(operacao == 1){

			return adiciona(primeiroNumero, segundoNumero);

		} else if (operacao == 2) {

			return diminui(primeiroNumero, segundoNumero);

		} else if (operacao == 3) {

			return multiplica(primeiroNumero, segundoNumero);

		} else if (operacao == 4) {

			return divide(primeiroNumero, segundoNumero);

		}

		return -1.0;
	}

	private Integer leiaOperacao() {
		System.out.println("Informe a operação desejada:\n1-Adição\n2-Subtração\n3-Multiplicação\n4-Divisão");

		return new Scanner(System.in).nextInt();
	}

	private Double leiaSegundaEntrada() {
		System.out.println("Informe o segundo número:");

		return lerEntrada();
	}

	
	private Double lerEntrada() {
		Scanner scanner = new Scanner(System.in);
		
		return scanner.nextDouble();
	}
	
	private Double leiaPrimeiraEntrada() {
		System.out.println("Informe o primeiro número:");

		return lerEntrada();
	}

	private Double adiciona(Double a, Double b) {
		
		if (a > 10) {

			return a + b;
			
		} else if (a < 10 && b < 10) {
			
			return 50.0;
			
		} else {
			
			return 50.0;
			
		}

	}

	private Double diminui(Double a, Double b) {
		return a - b;
	}

	private Double divide(Double a, Double b) {
		return a / b;
	}

	private Double multiplica(Double a, Double b) {
		return a * b;
	}
}
