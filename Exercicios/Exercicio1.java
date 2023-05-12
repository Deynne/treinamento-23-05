package com.treinamento.exercicios;

/**
 * Hello world!
 *
 */
public class Exercicio1
{
	public static int somaDeDoisNumeros(int numero1, int numero2) {
		return numero1 + numero2;
	}
	
	public static int subtracaoDeDoisNumeros(int numero1, int numero2) {
		return numero1 - numero2;
	}
	
	public static long exponencialDeBaseExpoente(int base, int expoente) {
		long resultado = base;
		
		if(expoente == 0) {
			return 1;
		}
		
		for(int i = 0; i < expoente;i++) {
			resultado = resultado * base;
		}
		
		return resultado;
	}
	
	public static void print(String texto) {
		System.out.println(texto);
	}
	
	public static void chamaASeMesma(int contador) {
		print(Integer.toString(contador));
		if(contador == 0) {
			return;
		}
		chamaASeMesma(contador - 1);
	}
	
    public static void main( String[] args )
    {
    	chamaASeMesma(100);
    	int n1 = 10;
    	int n2 = 20;
    	
    	int soma1 = somaDeDoisNumeros(n1, n2);
    	
    	int subN1N2 = subtracaoDeDoisNumeros(n1, n2);
    	int subN2N1 = subtracaoDeDoisNumeros(n2, n1);
    	
    	int n3 = 15;
    	int n4 = 25;
    	
    	int soma2 = somaDeDoisNumeros(n3, n4);
    	int subN3N4 = subtracaoDeDoisNumeros(n3, n4);
    	
    	print("soma1 = " + Integer.toString(soma1));
    	print("soma2 = " + Integer.toString(soma2));
    	print("subN1N2 = " + Integer.toString(subN1N2));
    	print("subN2N1 = " + Integer.toString(subN2N1));
    	print("subN3N4 = " + Integer.toString(subN3N4));
    	
    	print("2^3 = " + Long.toString(exponencialDeBaseExpoente(2, 3)));
    	print("10^5 = " + Long.toString(exponencialDeBaseExpoente(10, 5)));
    	print("3^3 = " + Long.toString(exponencialDeBaseExpoente(3,3)));
    	
    	String teste = "Olá Mundo!";
    	char arr[] = teste.toCharArray();
    	
    	for (int i = arr.length-1; i >= 0; i--) {
    		System.out.print(Character.toString(arr[i]));
		}
    }
}
