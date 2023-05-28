package com.treinamento.exercicio;

/**
 * 3 - Escrever um código que verifica se um número arbitrário é primo
 * 
 * Os números primos representam o conjunto dos números naturais, maiores que 1,
 * que possuem apenas dois divisores (1 e ele próprio).
 **/

import java.util.Scanner;

public class Exercicio3 {

	public static void main (String args[]){
		Scanner scan = new Scanner (System.in);

		int numero, eleMesmo=0, resto, contador=0;      

		System.out.println("Para saber se é PRIMO digite um Número: ");      
		numero = scan.nextInt();      

		while ( numero >= eleMesmo){    
			++eleMesmo;    

			resto = numero % eleMesmo;     

			if ( resto == 0){    
				contador++;    
			}    


		}    
		if ( contador <= 2)   {    

			System.out.println("O Número << "+numero+" >> É primo");    
		}    
		else    
		{    
			System.out.println("O Número << "+numero+" >> NÃO é primo");    
		}
		scan.close();

	}

}