package com.treinamento;

public class Exercicio3 {
    public static void main(String[] args) {

        int num = (int) (Math.random() * 100);

        if (isPrime(num)) {
            System.out.println("O número: " + num + " é primo.");
        } else {
            System.out.println("O número: " + num + " NÃO é primo.");
        }
    }

    static boolean isPrime(int n) {
        if (n <= 1) return false;

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
