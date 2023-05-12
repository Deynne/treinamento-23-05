import java.util.Scanner;
public class NumeroPrimo {
    public static void main(String args[]) {
        // Digite um número no Stdin Inputs

        Scanner sc1 = new Scanner(System.in);

        int numero = sc1.nextInt();
    
        for(int divisor = 2; divisor < numero; divisor++) {
            if (numero % divisor == 0) {
                System.out.println("O número não é primo");
                break;
            }
            else {
                System.out.println("O número é primo");
                break;
            }
        }
    }
}