package iniciante;

import java.util.Scanner;

public class Bee1165 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int casosDeTeste = sc.nextInt();

    while (casosDeTeste > 0) {

      int numero = sc.nextInt();

      int i = numero;

      boolean ehPrimo = true;

      while (ehPrimo && i > 0) {

        if ((numero % i == 0) && (i == numero || i == 1)) {
            ehPrimo = true;
        } else if(i != numero && i != 1 && numero % i != 0) {
          ehPrimo = true;
        } else {
          ehPrimo = false;
        }

        i--;
      }

      if (ehPrimo) {
        System.out.println(numero + " eh primo");
      } else {
        System.out.println(numero + " nao eh primo");
      }

      casosDeTeste--;
    }

  }
}

