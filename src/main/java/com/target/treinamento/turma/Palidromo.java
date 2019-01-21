package com.target.treinamento.turma;

public class Palidromo {

    public static void main(String[] args) {
        Palidromo palidromo = new Palidromo();


        System.out.println(palidromo.isPalindromo("rafael"));
        System.out.println(palidromo.isPalindromo("ovo"));
        System.out.println(palidromo.isPalindromo("socorram me subi no onibus em marrocos"));
    }

    private boolean isPalindromo(String valor) {

        String novoValor = valor.replaceAll("\\s+", "");

        Integer inicio = 0;
        Integer fim = novoValor.length();

        while(inicio < fim){

            if(novoValor.charAt(inicio) != novoValor.charAt(fim - 1) ) {
                return false;
            }

            inicio = inicio + 1;
            fim = fim - 1;
        }


        return true;
    }

}
