import java.util.Scanner;

public class Exercicio1 {

    public static void main(String args[]) {
        Scanner sc1 = new Scanner(System.in);
        
        int soma = 0;

        
        int contadorDeLimite = 0;
        
        while(sc1.hasNext() && contadorDeLimite < 2) {
            soma = soma + sc1.nextInt();
            contadorDeLimite++;
        }
        
        System.out.println(soma =+ soma);
        
    }
}