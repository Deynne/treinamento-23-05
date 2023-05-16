import java.util.Scanner;
public class Exercicio04{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int num = 2;
        int k = 0;
        do{
            System.out.println("Os números primos são: ");
                
                for(int i = num; i > 1; i++){
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
            k++;
        }while(k < 1001);
    }
}