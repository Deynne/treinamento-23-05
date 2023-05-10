import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int soma = 0;
        int contadorDeLimite = 0;

        while (sc.hasNext() && contadorDeLimite < 2) {
            soma = soma + sc.nextInt();
            contadorDeLimite++;
        }
        System.out.println("Soma = " + soma);
    }
}