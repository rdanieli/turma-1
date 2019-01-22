package com.target.treinamento.turma;

import java.util.Scanner;

public class MeuPrimeiroArray {

	
	public static void main(String[] args) {
		new MeuPrimeiroArray().inicializa();
	}

	private void inicializa() {
		
		Double[] meuArray = new Double[10];
		
		for (int i = 0; i < 10; i++) {
			meuArray[i] = lerEntrada();
		}	
		
		imprimeNaTela(meuArray);
		
		efetuaOperacao(meuArray);
		
		imprimeNaTela(meuArray);
	}
	
	private void imprimeNaTela(Double[] meuArray) {
		for (int i = 0; i < meuArray.length; i++) {
			System.out.println(meuArray[i]);
		}
	}

	//[1,1,1,1,1,1,1,1,1,1]
	// 0 1 2 3 4 5 6 7 8 9
	private void efetuaOperacao(Double[] meuArray) {
		for (int i = 0; i < meuArray.length; i++) {
			meuArray[i] = meuArray[i] * meuArray[i];
		}
	}
	


	public Double lerEntrada() {
		Scanner scanner = new Scanner(System.in);
		
		return scanner.nextDouble();
	}
	
}
