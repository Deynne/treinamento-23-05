import java.util.Scanner;
public class Exercicio02{
    
    public static void main(String[] args)
    {
        Scanner sc1 = new Scanner(System.in);
      
        int i = 0;
      
        int str = sc1.nextInt();
        
        System.out.println("Número é: "+str);
        float resultado = str % 2;
        
        if(resultado == 0){
            System.out.println("O número é Par.");
        }else{
          System.out.println("O número é ímpar.");
        }
       
       //sc1.close(); 
    }
}