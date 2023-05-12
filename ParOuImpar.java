import java.util.Scanner;
public class ParOuImpar {
    public static void main(String args[]) {
        // Digite um número no Stdin Inputs
        Scanner sc1 = new Scanner(System.in);
        int numero = sc1.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O número " + numero + " é par.");    
        }
        else {
            System.out.println("O número " + numero + " é ímpar.");
        }
        
    }
}