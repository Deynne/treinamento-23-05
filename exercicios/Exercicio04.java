public class Exercicio04 {
    public static void main(String args[]) {
       
        for(int numero = 2; numero <= 1000; numero++) {
            
            int divisor = 2;
            
            if(numero == 2) {
                System.out.print(numero + ", ");
                divisor++;
            }
            else if(numero % divisor == 0) {
                divisor++;
            }
            else {
                System.out.print(numero + ", ");
                divisor++;
            }
        }
    }
}
