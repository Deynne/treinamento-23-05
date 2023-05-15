import java.lang.Math;

public class exercicio4 {
  
  /*Defini uma função para veriticar se um numero é primo ou não e outra para imprimir o resultado da verificação; */
  public static boolean ehPrimo(int numero){
  
    int[] primosAte12 = {2,3, 5, 7, 11};
    boolean primo = false;
  
    for (int i = 0; i < 5; i++){
      if (numero == primosAte12[i]){
          primo = true;
      }
    }

    if ((((numero)%12 == 1) || ((numero)%12 == 5) || ((numero)%12 == 7) || ((numero)%12 == 11)) && (numero > 12)){
      for (int k = 3; k <= Math.sqrt(numero); k += 2) {
        if (numero % k == 0) {
          primo = false;
          break;
        }
        else{
          primo = true;
        }
      }
    }
    
    return primo;

  }

  public static void main(String[] args) {

    System.out.println("Contando os primos até 1000...");
    for (int i = 0; i < 1000; i++) {
    
      if (ehPrimo(i)) {
        System.out.println( i + "... É Primo");
      }
    }  
  }

}
