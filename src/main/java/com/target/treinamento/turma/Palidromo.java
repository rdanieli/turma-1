package com.target.treinamento.turma;

public class Palidromo {

	public final static Double VALOR_PI = 3.14;
		
	/**
	 * Este é o método principal da minha classe.
	 * @param args
	 */
    public static void main(String[] args) {
    	
    	Palidromo palidromo = new Palidromo();

        System.out.println(palidromo.isPalindromo("raf23-123ael"));
        System.out.println(palidromo.isPalindromo("o44vo"));
        System.out.println(palidromo.isPalindromo("socorram me subi no onibus em marrocos"));
    }

    /**
     * 
     * @param valor
     * @return
     */
    private boolean isPalindromo(String valor) {
    	
    	String novoValor = valor.replaceAll("\\d", "").replaceAll("\\*", "");
        
        Integer inicio = 0, fim = novoValor.length();

        while(inicio < fim){

            if(novoValor.charAt(inicio) != novoValor.charAt(fim - 1) ) {
                return false;
            }

            inicio = inicio + 1;
            fim = fim - 1;
        }


        return true;
    }
    
    
    private boolean isPalindromoComFor(String valor) {
    	   	
    	return true;
    	
    }

}
