package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Bee1036 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double A = scan.nextDouble();
        double B = scan.nextDouble();
        double C = scan.nextDouble();

        scan.close();

        double delta = Math.pow(B, 2) - 4 * A * C;

        if(A > 0 && delta > 0 && (delta > 0 || delta == 0)){
            double R1 = ((-B) + Math.sqrt(delta))/(2*A);
            double R2 = ((-B) - Math.sqrt(delta))/(2*A);

            System.out.printf("R1 = %.5f%n", R1);
            System.out.printf("R2 = %.5f%n", R2);
        } else {
            System.out.printf("Impossivel calcular%n");
        }
    }
}
