import java.util.Scanner;
public class Exercicio03 {
    public static void main(String args[]) {
        // Digite um número no Stdin Inputs
        Scanner sc1 = new Scanner(System.in);

        int numero = sc1.nextInt();
        
        if(numero < 3) {
            System.out.println("O número " + numero + " é primo.");
        }
        else {
            for(int divisor = 2; divisor < numero; divisor++) {
                if (numero % divisor == 0) {
                    System.out.println("O número " + numero + " não é primo.");
                    return;
                }
                else {
                    System.out.println("O número " + numero + " é primo.");
                    return;
                }
            }
        }
    
    }
}
