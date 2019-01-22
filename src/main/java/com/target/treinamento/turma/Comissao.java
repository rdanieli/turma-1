package com.target.treinamento.turma;

public class Comissao {
	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora();
		Comissao comissao = new Comissao();
		
		
		comissao.meuMetodo();
		
		
//		System.out.println("O resultado da multiplicação é: " + 
//		calculadora.multiplica(15.0, 10.0));
		
		
		
	}
	
	private void meuMetodo() {
		
		int soma = 0;
		
		while(soma < 10) {

			System.out.println("Soma="+soma+" Rafael " + (soma + 1));
			soma = soma + 1;
			
		}
		
		
		
	}
}
