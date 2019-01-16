package com.target.treinamento.turma;

import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args) {

		Calculadora minhaCalculadora = new Calculadora();
		
		
		Double a = minhaCalculadora.leiaPrimeiraEntrada();
		Double b = minhaCalculadora.leiaSegundaEntrada();

		Double minhaVariavel = minhaCalculadora.adiciona(a, b);
		System.out.println("O resultado da adição = " + minhaVariavel);
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
			
			Double resultado = (a + b);
			return (resultado);
			
		} else if (a < 10 && b < 10) {
			
			return 50.0;
			
		} else {
			
			return 50.0;
			
		}

	}

	private Double diminui(Double a, Double b) {
		Double resultado = (a - b);
		return (resultado);
	}

	private Double divide(Double a, Double b) {
		Double resultado = (a / b);
		return (resultado);
	}

	private Double multiplica(Double a, Double b) {
		Double resultado = (a * b);
		return (resultado);
	}
}
