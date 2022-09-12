package iniciante;

import java.util.Scanner;

public class Bee1009 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        scan.nextLine();
        double salarioFixo = scan.nextDouble();
        double valorTotalVendasEfetuadas = scan.nextDouble();
        
        scan.close();

        double comissao = valorTotalVendasEfetuadas * 0.15;

        System.out.printf("TOTAL = R$ %.2f%n", (salarioFixo + comissao));
    }
}
