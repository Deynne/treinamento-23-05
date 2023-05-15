package com.treinamento;

public class Exercicio2 {
    public static void main(String[] args) {

        int num = (int) (Math.random() * 1000);

        if (num % 2 == 0) {
            System.out.println("O número: " + num + " é par.");
        } else {
            System.out.println("O número: " + num + " é ímpar.");
        }
    }
}
