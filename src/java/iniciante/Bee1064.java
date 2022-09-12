package iniciante;

import java.util.Scanner;

public class Bee1064 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int positivos = 0; 
        double media = 0;

        for (int i = 0; i < 6; i++) {   
            double valor = scanner.nextDouble();
            if (valor > 0){ 
                positivos++;
                media += valor;
            };
        }

        scanner.close();

        System.out.println(positivos + " valores positivos");  
        System.out.printf("%.1f%n", (media/positivos));      
    }
}
