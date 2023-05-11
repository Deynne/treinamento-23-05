import java.util.Scanner;

public class Exercicio1 {

public static void main(String args[]) {

Scanner sc1 = new Scanner(System.in);
int soma = 0;
int contadorDeLimite =0;
 while(sc1.hasNext()&& contadorDeLimite<2) {
  soma = soma+ Integer.parseInt(sc1.next());
  contadorDeLimite++;
}
System.out.println("soma = "+ soma);
}
}
