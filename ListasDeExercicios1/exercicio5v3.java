/* O Exercício 5 permite três interpretações:
1. o código verifica se o numero é multiplo de 2, 3 , 5 e 7 e insere as quatro condições;
2. o código verifica e insere a primeira condição que atender;
3. o código verifica e atualiza para a última condição atendida

Fiz a atividade 5 nas três versões (v1, v2 e v3) - e por fim na terceira ele conta os números e atende a ultima condição a aparecer
 */

public class exercicio5v3 {
  
  public static void main(String[] args) {
    
    System.out.println("Contando até 1000 - com condições para Multiplos de 2, 3, 5 e 7 - versão 3 ...");
    boolean m7 = true;
    String retorno = "";

    for (int i = 0; i <= 1000; i++) {
      retorno = i + " - > " + i;
      
      if (i % 2 == 0){
        retorno = i + " -> | m2: Olá Mundo! |";  
      }
      if (i % 3 == 0) {
        retorno = i + " -> | m3: " + (2*i - 1) + " |";
      }
      if (i % 5 == 0) {
        retorno = i + " -> | m5: " + (i * i) + " |";
      }
      if (i % 7 == 0) {
        retorno = i + " -> | m7: "+ m7 +" |";
        m7 = !(m7);
      }
      
      System.out.println(retorno);
      
    }
  }
}
