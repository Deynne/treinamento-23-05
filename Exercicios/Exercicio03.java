import java.util.Scanner;
public class Exercicio03{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int num = scan.nextInt();
        
        System.out.println("Digite um número: ");
        
      
        if(num > 1){
            System.out.println("Os números primos são: ");
            for(int i = num; i > 1; i--){
                for(int j = i - 1; j > 0; j--){
                    if(j == 1){
                        System.out.println(i);
                    }else{
                        if(i%j == 0){
                            break;
                        }
                    }
                }
            
            }
        }else{
            System.out.println("Os números 0 e 1 não são números Primos");     
        }
    }
}