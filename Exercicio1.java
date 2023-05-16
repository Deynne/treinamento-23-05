import java.util.Scanner;

public class Exercicio1 {
  public static void main(String[] args) {
    
    Scanner valores = new Scanner(System.in);
    
    System.out.println("Entre com o primeiro numero");
    int primeiroNumero = valores.nextInt();
    
    System.out.println("Entre com o segundo numero");
    int segundoNumero = valores.nextInt();

    int soma = primeiroNumero + segundoNumero;
    System.out.println("O total da soma e "+soma);
  }
}