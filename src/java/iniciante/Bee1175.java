package iniciante;

import java.util.Scanner;

public class Bee1175 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int [] vetor = new int[20];

    for (int i = 0; i < vetor.length; i++) {
      vetor[i] = sc.nextInt();
    }

    for (int i = 0, pos = vetor.length - 1; i < vetor.length/2; i++, pos--) {

      int aux = vetor[i];
      vetor[i] = vetor[pos];
      vetor[pos] = aux;
    }

    for (int i = 0; i < vetor.length; i++) {
      System.out.println("N["+i+"] = " + vetor[i]);
    }
  }
}
