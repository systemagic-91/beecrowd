package iniciante;

import java.util.Scanner;

public class Bee1094 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int totalCoelhos = 0;
        int totalRatos = 0;
        int totalSapos = 0;

        int casos = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < casos; i++) {

            String [] info = scanner.nextLine().split(" ");
            int quantia = Integer.parseInt(info[0]);
            String tipo = info[1];

            if(tipo.compareTo("C") == 0) totalCoelhos += quantia;
            if(tipo.compareTo("R") == 0) totalRatos += quantia;
            if(tipo.compareTo("S") == 0) totalSapos += quantia;
        }
        
        scanner.close();

        int totalCobaias = totalCoelhos+totalRatos+totalSapos;
        double porcentagem;

        System.out.printf("Total: %d cobaias%n", totalCobaias);
        System.out.printf("Total de coelhos: %d%n", totalCoelhos);
        System.out.printf("Total de ratos: %d%n", totalRatos);
        System.out.printf("Total de sapos: %d%n", totalSapos);
        porcentagem = (totalCoelhos * 100.00)/(double)totalCobaias;
        System.out.printf("Percentual de coelhos: %.2f", porcentagem);        
        System.out.println(" %");
        porcentagem = (totalRatos * 100.00)/(double)totalCobaias;
        System.out.printf("Percentual de ratos: %.2f", porcentagem);
        System.out.println(" %");
        porcentagem = (totalSapos * 100.00)/(double)totalCobaias;
        System.out.printf("Percentual de sapos: %.2f", porcentagem);
        System.out.println(" %");
    }
}
