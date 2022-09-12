package iniciante;

import java.util.Scanner;

public class Bee1080 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int maior = Integer.MIN_VALUE;
        int posicao = 0;

        for (int i = 1; i <= 100; i++) {
            int valor = scanner.nextInt();
            if (valor > maior) {
                maior = valor;
                posicao = i;
            }
        }
        
        scanner.close();

        System.out.println(maior);
        System.out.println(posicao);

    }
}
