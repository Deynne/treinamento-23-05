import java.util.Scanner;

public class Exercicio2 {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner (System.in);
		int numero;
		
		System.out.print("Digite um número: ");
		numero = leitor.nextInt();
		
		if((numero % 2) == 0){
	    	System.out.println("O número digitado é Par");
		}else{
			System.out.println("O número digitado não é Impar");
		}	
	}
}