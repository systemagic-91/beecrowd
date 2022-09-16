package iniciante;

import java.util.Scanner;

public class Bee1154 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int quantidadeDados = 0;
        double somaIdades = 0;
        
        int dado = scanner.nextInt();

        while (dado > 0) {
            quantidadeDados++;
            somaIdades += dado;
            dado = scanner.nextInt();
        }

        scanner.close();

        System.out.printf("%.2f%n", (somaIdades/quantidadeDados));
    }
}
