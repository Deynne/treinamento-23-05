import java.util.Scanner;

public class Exercicio3 {
	
	public static void main(String[] args) {
		
		// Numero primo: divisivel por 1 e por ele mesmo(SOMENTE)!
		// Numero de divisores é 2
		
		Scanner leitor = new Scanner (System.in);
		int numPrimo;
		int numDivisores = 0;
		
		System.out.print("Digite um número: ");
		numPrimo = leitor.nextInt();
		
		for(int i = 1; i <=numPrimo; i++){
			if(numPrimo % i == 0){
				numDivisores++;
			}
		}
		
		if(numDivisores == 2){
			System.out.println("O número digitado é primo");
		}else{
			System.out.println("O número digitado não é primo");
		}	
	}
}