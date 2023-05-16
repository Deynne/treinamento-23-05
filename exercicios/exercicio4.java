package com.treinamento.exercicio;

public class exercicio4 {

	public static void main(String[] args) {
		int nA =121;
        
        for(int i = 2; i<=1000;i++ ) {
        	   System.out.println(i);
        }
        
        if(nA % 7 == 0 && nA != 7 ||nA % 5 == 0 && nA != 5 || nA % 3 == 0 && nA != 3 ||  nA % 2 == 0 && nA != 2){
        	
        	    
                System.out.println("É PRIMO!");
            }else
            {
                System.out.println("NÃO É PRIMO!");
            }
    }
}