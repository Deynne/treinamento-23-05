package com.treinamento.exercicio;

/**
 * 4- Escrever um código que conta todos os números primos 2 até 1000
 * 
 **/

public class Exercicio4 {

	public static void main(String[] args) {

		for (int i = 2, cont = 0; i <= 1000; i++) {
			if (i == 1000) {
				System.out.println("Números Primos de 2 a 1000: << " + cont+ " >>");
			}else {

				if (ehPrimo(i)) { 
					//System.out.println(i + " é primo.");
					cont = cont + 1;
				}else {

				}
			}
		}
	}
	private static boolean ehPrimo(int numero) {

		for (int j = 2; j < numero; j++) {
			if (numero % j == 0)
				return false;
		}
		return true;
	}
}