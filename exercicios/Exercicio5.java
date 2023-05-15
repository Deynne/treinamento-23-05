package com.treinamento;

public class Exercicio5 {
    public static void main(String[] args) {
        int numero = 0;
        boolean multiplo7 = true;
        for(int j = 0; j < 1000; j++) {
            numero = j;
            if(numero % 2 == 0) {
                System.out.println("Olá Mundo!");
            } else if(numero % 3 == 0) {
                numero = numero + (j-1);
                System.out.println("Soma com numero anterior: " + numero);
            } else if(numero % 5 == 0) {
                numero = numero * numero;
                System.out.println("Quadrado: " + numero);
            } else if(numero % 7 == 0) {
                System.out.println(multiplo7);
                multiplo7 = false;
            }
        }
    }
}
