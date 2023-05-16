package com.treinamento.exercicio;

import java.lang.Math;

public class Exercicio04
{
	public static void main( String[] args )
    {
		boolean ehPrimo = true;
        int numero = 0;
        int conta = 0;
        for(int j = 2; j < 1000; j++) {
        	ehPrimo = true;
        	numero = j;
        	if(numero < 2) {
        		ehPrimo = false;
        	} else {
        		for(int i = 2; i <= Math.sqrt(numero); i++) {
        			if(numero % i == 0) {
        				ehPrimo = false;
        			}
        		}
        	} 
        
        	if (ehPrimo == true) {
        		System.out.println(Integer.toString(numero)+" É PRIMO");
        		conta++;
        	}
        	else
        		System.out.println(Integer.toString(numero)+" NÃO É PRIMO");
        }
        System.out.println("Quantidade de Números Primos encontrados:" + conta);
    }
}