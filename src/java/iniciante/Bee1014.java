package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Bee1014 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int distanciaPercorrida = scan.nextInt();
        double combustivelGasto = scan.nextDouble();

        scan.close();
        
        System.out.printf("%.3f km/l%n",(distanciaPercorrida/combustivelGasto));
    }    
}
