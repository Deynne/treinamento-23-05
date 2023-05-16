package com.treinamento.exercicios;
import java.util.ArrayList;
import java.util.Scanner;

public class exercicios 
{
    public static void main( String[] args )
    {
            
            //EXERCÍCIO 01
            
            /*for(int i = 0; i <= 1000; i++) {
                    System.out.println(i);
            }*/
            
            
            //=======================================
            
            //EXERCÍCIO 02
            
            /* Scanner numAleatorio = new Scanner(System.in);
            System.out.print("Digite um número: ");
        int numero = numAleatorio.nextInt();
        
        if((numero % 2) == 0){
                System.out.println("O número "+numero+" é par.");
        } else {
                System.out.println("O número "+numero+" é ímpar.");
        }
            
        numAleatorio.close();*/
            
            
            //=======================================
            
            //EXERCÍCIO 03
            
//             int i = 0;
//         int divisivel = 0;
//
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Digite um número inteiro: ");
//         int numeroInserido = scanner.nextInt();
//
//         for(i = 1; i <= numeroInserido; i++) {
//             if(numeroInserido % i == 0){
//                 divisivel += 1;
//             }
//         }
//         if(divisivel > 2){
//             System.out.println("Número "+numeroInserido+" não é primo.");
//         } else {
//             System.out.println("Número "+numeroInserido+" é primo.");
//         }
//         scanner.close();
//         
            //=======================================
            
            //EXERCÍCIO 04
            
                int i = 1;
                ArrayList<Integer> numerosPrimos = new ArrayList<Integer>();


                Scanner scanner = new Scanner(System.in);
                System.out.print("Digite um número inteiro: ");
                int numeroInserido = scanner.nextInt();


                for (i = 1; i <= numeroInserido; i++) {
                        int divisivel = 0;
                        for (int j = 1; j <= i; j++) {
                                if (i % j == 0) {
                                        divisivel += 1;
                                }
                        }
                        if (divisivel <= 2) {
                                numerosPrimos.add(i);
                        }
                }
                System.out.println("No total são " + numerosPrimos.size() + " números primos, contidos no intervalo de 1 a "
                                + numeroInserido + ". São eles: " + numerosPrimos);
                scanner.close();
                
                //=======================================
            
            //EXERCÍCIO 05
            
            /*Scanner scanner = new Scanner(System.in);
            System.out.print("Digite um número inteiro: ");
            int limite =  scanner.nextInt();
            boolean booleanAlternado = true;
            
            for(int i = 0; i <= limite; i++) {


                if(i == 0){
                        System.out.println(i);
                } else if(i % 2 == 0) {
                        System.out.println("Olá Mundo!");
                } else if(i % 3 == 0) {
                        System.out.println("Somado: "+i+" + "+(i-1)+" = " + (i + (i-1)));
                } else if(i % 5 == 0) {
                        System.out.println("Quadrado de "+i+" é "+(i*i));
                } else if(i % 7 == 0) {
                        System.out.println(booleanAlternado);
                    booleanAlternado = !booleanAlternado;
                } else {
                        System.out.println(i);
                }
            }
            scanner.close();*/
    }
}