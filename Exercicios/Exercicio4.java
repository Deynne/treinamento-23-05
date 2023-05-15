public class Exercio4 {

    public static void main(String[] args) {    
        for (int i = 2; i <= 1000; i++) {
            if( nPrimo(i) )
                System.out.println(i + " é primo.");
        }    
    }
 
    private static boolean nPrimo(int numero) {
        for (int j = 2; j < numero; j++) {
            if (numero % j == 0)
                return false;   
        }
        return true;
    }
}