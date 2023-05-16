package com.treinamento.exercicio;

public class exercicio3 {

	public static void main(String[] args) {
        int nA = 5;
        
        if(nA % 7 == 0 && nA != 7 ||nA % 5 == 0 && nA != 5 || nA % 3 == 0 && nA != 3 ||  nA % 2 == 0 && nA != 2){
            System.out.println("não é primo");
            }else
            {
                System.out.println("é primo");
            }
    }
}
