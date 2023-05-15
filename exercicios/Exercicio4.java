package com.treinamento;

public class Exercicio4 {
    public static void main(String[] args) {

        int numerosPrimos = 0;

        for (int i = 2; i <= 1000 ; i++) {
            if (isPrime(i)) {
                numerosPrimos++;
            }
        }
        System.out.println("Números primos entre 2 e 1000: " + numerosPrimos);
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
