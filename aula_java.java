import java.util.Scanner;
 
public class MyClass {
    
    public static int soma (int a, int b) {
        return a + b;
    }
 
    public static void main(String args[]) {
        Scanner sc1 = new Scanner(System.in);
        
        soma(1,2);
        
        int soma = 0;
        
        
        int contadorDeLimite = 0;
        
        while(sc1.hasNext() && contadorDeLimite  2) {
            soma = soma + sc1.nextInt();
            contadorDeLimite++;
        }
        
        System.out.println(soma =  + soma);
        
    }
}