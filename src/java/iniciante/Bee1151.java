package iniciante;

import java.util.Scanner;

public class Bee1151 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        scanner.close();

        int fiboProximo;
        int fiboAnterior = 0;
        int fiboAtual = 1;

        for (int i = 1; i <= n; i++) {
            
            if (i == n) System.out.println(fiboAnterior);
            else System.out.print(fiboAnterior + " ");

            fiboProximo = fiboAnterior + fiboAtual;
            fiboAnterior = fiboAtual;
            fiboAtual = fiboProximo;
        }
    }
}
