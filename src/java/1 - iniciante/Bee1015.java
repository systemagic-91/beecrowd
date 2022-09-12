package iniciante;

import java.util.Scanner;
import java.util.Locale;

public class Bee1015 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double x1, y1, x2, y2, distancia;

        x1 = scan.nextDouble();
        y1 = scan.nextDouble();
        x2 = scan.nextDouble();
        y2 = scan.nextDouble();

        scan.close();

        distancia = Math.sqrt(Math.pow((x2 - x1), 2)+ Math.pow((y2 - y1), 2));

        System.out.printf("%.4f%n", distancia);
    }
}
