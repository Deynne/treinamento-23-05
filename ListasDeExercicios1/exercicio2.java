import java.util.Scanner;

public class exercicio2 {
  public static void main(String[] args) {
  
    Scanner entrada = new Scanner(System.in);
    System.out.println("Qual o número você quer saber se é par ou impar?");
    int numero = entrada.nextInt();
    
    if (numero % 2 == 0) {
      System.out.println("É Par!");
    }
    else{
      System.out.println("É Ímpar!");
    }
  }  
}