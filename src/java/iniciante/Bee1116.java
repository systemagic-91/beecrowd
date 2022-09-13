package iniciante;

import java.util.Scanner;

public class Bee1116 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String [] linha = scanner.nextLine().split(" ");
            double numerador = Double.parseDouble(linha[0]);
            double denominador = Double.parseDouble(linha[1]);

            if (denominador == 0) {
                System.out.println("divisao impossivel");
            } else {
                System.out.printf("%.1f%n", (numerador/denominador));
            }
        }

        scanner.close();
    }
}
