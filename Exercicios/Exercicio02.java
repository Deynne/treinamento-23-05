package com.treinamento.exercicio;

import java.util.Scanner;

public class Exercicio02 
{
	public static void main( String[] args )
    {	
		System.out.println("Digite um número: ");
        Scanner sc1 = new Scanner(System.in);
        int numero = Integer.parseInt(sc1.next());
        
        if(numero%2 == 0) {
        	System.out.println(Integer.toString(numero)+" é um numero PAR");
        }
        else {
        	System.out.println(Integer.toString(numero)+" é um numero ÍMPAR");
        }
        ;        
    	
    }
}
