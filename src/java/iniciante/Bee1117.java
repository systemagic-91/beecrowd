package iniciante;

import java.util.Scanner;

public class Bee1117 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int notasValidas = 0;
        double media = 0;

        while(notasValidas < 2){
            
            double v = scanner.nextDouble();

            if (0.0 <= v && v <= 10.0) {
                media += v;
                notasValidas++;
            } else {
                System.out.println("nota invalida");
            }
             
        }

        System.out.printf("media = %.2f%n", media/notasValidas);

        scanner.close();
    }
}
