package com.target.treinamento.turma;

import java.util.Scanner;

public class OperacoesVetor {

	private Integer[] array;

	public void inicializa() {

		boolean casoDeParada = true;
		
		while(casoDeParada) {
			System.out.println("Meu programa:");
			System.out.println("[1] - Carregar vetor");
			System.out.println("[2] - Listar vetor");
			System.out.println("[3] - Sair - Interromper Execução");
			
			casoDeParada = lerOpcoes();
		}
	}
	
	private boolean lerOpcoes() {
		String opcao = lerEntrada();
		
		switch(opcao) {
			
			case "1":
				
				carregaVetor();
				break;
				
			case "2":
				
				listarElementos();
				break;
				
			case "3":
				
				System.out.println("Parando a execução do programa.");
				return false;
				
			default:
				
				System.out.println("Opção inválida.");	
				
		}
		
		return true;
	}
	
	private void listarElementos() {
		for(Integer valor: array) {
			System.out.println("O valor é: " + valor);
		}
	}

	private void carregaVetor() {
		System.out.println("Informe o tamanho do vetor:");
		String tamanho = lerEntrada();
		this.array = new Integer[Integer.parseInt(tamanho)];
		
		for (int i = 0; i < this.array.length; i++) {
			System.out.println("Informe o número " + (i + 1) + ":");
			
			this.array[i] = Integer.parseInt(lerEntrada());
		}
		
		System.out.println("Array foi carregado com sucesso!");
	}

	public String lerEntrada() {
		Scanner scanner = new Scanner(System.in);
		
		return scanner.next();
	}
	
}
