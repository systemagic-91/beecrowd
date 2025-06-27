package iniciante;

import java.util.Scanner;

public class Bee1173 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    int [] vetor = new int[10];

    vetor[0] = n;

    System.out.println("N[0] = " +  vetor[0]);

    for (int i = 1; i < 10; i++) {

      vetor[i] = vetor[i-1] * 2;

      System.out.println("N["+i+"] = " +  vetor[i]);
    }
  }

}
