/* O Exercício 5 permite três interpretações:
1. o código verifica se o numero é multiplo de 2, 3 , 5 e 7 e insere as quatro condições;
2. o código verifica e insere a primeira condição que atender;
3. o código verifica e atualiza para a última condição atendida

Fiz a atividade 5 nas três versões (v1, v2 e v3) - nesta primeira ele conta os números e atende todas as condições
 */

public class exercicio5v1 {
  
  public static byte verDivisores(int numero){

    byte divisores = 0;

    if (numero % 2 == 0){
      divisores += 8;
    }
    
    if (numero % 3 == 0){
      divisores += 4;
    }

    if (numero % 5 == 0){
      divisores += 2;
    }

    if (numero % 7 == 0){
      divisores += 1;
    }
    
    return divisores;

  }

  public static void main(String[] args) {

    
    System.out.println("Contando até 1000 - com condições para Multiplos de 2, 3, 5 e 7 - versão 1 ...");
    
    for (int i = 0; i <= 1000; i++) {
      byte divisores = verDivisores(i);
      String retorno = " -> ";
      
      if (divisores == 0){
        retorno += i;
      }

      if (divisores>=8){
        retorno += "| m2: Olá Mundo! |";
        divisores -= 8;
      }
      if (divisores>=4){
        retorno += "| m3: " + (2*i - 1) + " |";
        divisores -= 4;
      }
      if (divisores>=2){
        retorno += "| m5: " + (i * i) + " |";
        divisores -= 2;
      }
      if (divisores == 1){
        if ((i / 7) % 2 == 0 ) {
          retorno += "| m7: True |";
        } else {
          retorno += "| m7: False |";
        }
        
      }

      System.out.println(i + retorno);  
    }

  }

}
