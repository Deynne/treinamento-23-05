package com.treinamento.exercicio;

import java.util.Scanner;
import java.lang.Math;

public class Exercicio03 
{
	public static void main( String[] args )
    {	boolean ehPrimo = true;
		System.out.println("Digite um número: ");
        Scanner sc1 = new Scanner(System.in);
        int numero = Integer.parseInt(sc1.next());
        
        if(numero < 2) {
        	ehPrimo = false;
        } else {
        	for(int i = 2; i <= Math.sqrt(numero); i++) {
        		if(numero % i == 0) {
        			ehPrimo = false;
        		}
        	}
        } 
        
        if (ehPrimo == true)
        	System.out.println(Integer.toString(numero)+" É PRIMO");
        else
        	System.out.println(Integer.toString(numero)+" NÃO É PRIMO");

    }
}