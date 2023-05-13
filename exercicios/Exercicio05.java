public class Exercicio05 {
    public static void main(String args[]) {
       
        boolean valor = true;
        
        for(int numero = 0; numero <= 1000; numero++) {
            
            
            if(numero % 2 == 0) {
                System.out.println("Olá, Mundo! ");
                
            } 
            else if (numero % 3 == 0) {
                System.out.println(numero + numero - 1 + ", ");
            }
            
            else if (numero % 5 == 0) {
                System.out.println(numero * numero + ", ");
            }
            
            else if (numero % 7 == 0) {
                if(valor == true) {
                    System.out.println("true");
                    valor = false;
                } else {
                    System.out.println("false");
                    valor = true;
                }
            }
            
            else {
                System.out.println(numero + ", ");
            }
        }
    }
}
