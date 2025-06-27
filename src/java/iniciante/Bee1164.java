package iniciante;

import java.util.Scanner;

public class Bee1164 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int casosDeTeste = sc.nextInt();

    while (casosDeTeste > 0) {

      int numero = sc.nextInt();

      int soma = 0;

      int  i = numero - 1;

      while (i > 0) {

        if (numero % i == 0) {
          soma += i;
        }

        i--;
      }

      if (soma == numero){
        System.out.println(numero + " eh perfeito");
      } else {
        System.out.println(numero +  " nao eh perfeito");
      }

      casosDeTeste--;
    }

  }
}
