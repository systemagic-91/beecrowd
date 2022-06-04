package iniciante;

import java.util.Scanner;

public class Bee1010 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int codPeca1, quantDePeca1, codPeca2, quantDePeca2;
        double valorUnidadePeca1, valorUnidadePeca2, soma;

        codPeca1 = scan.nextInt();
        quantDePeca1 = scan.nextInt();
        valorUnidadePeca1 = scan.nextDouble();

        codPeca2 = scan.nextInt();
        quantDePeca2 = scan.nextInt();
        valorUnidadePeca2 = scan.nextDouble(); 
        
        scan.close();

        soma = (quantDePeca1 * valorUnidadePeca1) + (quantDePeca2 * valorUnidadePeca2);

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", soma);
    }
}
