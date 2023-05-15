package com.treinamento.exercicio;

/**
 * 5- Escrever um código que conta de 0 a 1000, mas segue as seguintes
 * restrições: - Se o número for multiplo de 2 substitui ele pelo texto "Olá
 * Mundo!" - Se o número for multiplo de 3 soma ele com o número anterior - Se o
 * número for multiplo de 5 substitui ele pelo seu quadrado - Se o número for
 * multiplo de 7 Substitui ele por True ou False. Os valores devem alternar
 * iniciando de True
 *
 */
public class Exercicio5 {
	public static void main(String[] args) {
		int fator2 = 2;
		int fator3 = 3;
		int fator5 = 5;
		int fator7 = 7;

		if (fator2 == 2) {
			for (int i = 0; i <= 1000; i++) {
				if (multiplos2(i, fator2)) {
				System.out.println("Olá Mundo!!");
				}
			}
		}

		if (fator3 == 3) {
			for (int i = 0; i <= 1000; i++) {
				if (multiplos3(i, fator3)) {
					
				}
			}
		}

		if (fator5 == 5) {
			for (int i = 0; i <= 1000; i++) {
				if (multiplos5(i, fator5)) {
				}
			}
		}

		if (fator7 == 7) {
			for (int i = 0; i <= 1000; i++) {
				if (multiplos7(i, fator7)) {
					System.out.println("True");
				}
				System.out.println("False");
			}
		}
	}

	private static boolean multiplos2(int numero, int fator2) {
		int result = numero * fator2;

		if (result % fator2 == 0) {
			return true;
		}
		return false;
	}

	private static boolean multiplos3(int numero, int fator3) {
		int auxiliar = 0;
		int result = numero * fator3;

		if (result % fator3 == 0) {
			result = result + fator3;
			auxiliar = result + result;
			System.out.println("Resultado da soma << " + auxiliar + " >>");
			return true;
		}
		return false;
	}

	private static boolean multiplos5(int numero, int fator5) {
		int result = numero * fator5;

		if (result % fator5 == 0) {
			result = result * result;
			System.out.println("Número ao quadrado << " + result + " >>");
			return true;
		}
		return false;
	}

	private static boolean multiplos7(int numero, int fator7) {

		int result = numero * fator7;

		if (result % fator7 == 0) {
			return true;
		}
		return false;
	}
}