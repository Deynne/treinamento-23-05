package com.treinamento.exercicio;
import java.util.Scanner;

/**
 * 2- Escrever um código que verifica se um número arbitrário é par ou impar
 **/

public class Exercicio2 
{
	public static void main( String[] args )
	{
		Scanner sc1 = new Scanner(System.in);

		System.out.println("Informe um número: ");
		int valor = sc1.nextInt();

		while(valor != 0) {		
			if(valor %2 == 0) {
				System.out.println("O valor informado: << "+ valor + " >> é PAR");
			}else {
				System.out.println("O valor informado: << "+ valor + " >> é ÍMPAR");
			}
			System.out.println("Pra SAIR digite 0: ");
			valor = sc1.nextInt();
		}
		sc1.close();
	}
}
