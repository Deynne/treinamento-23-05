import java.util.Scanner;

public class teste {
	
	public static void main(String[] args) {
		int num = 0;
		
		for (int i = 0; i <= 10; i++){
			if (i % 2 == 0){
				System.out.println("Olá mundo!");
				num = i;
			}
			if(i % 3 == 0)
				System.out.println(num + i);
			if(i % 5 == 0){
				num = i;
				System.out.println(num * i);
			}
			if(i % 7 == 0){
				num = i;
				if (num % 7 == 0){
					System.out.println("True");	
				}
			}else
				System.out.println("False");
		}
	}
}